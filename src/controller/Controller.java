package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.DataReader;
import view.DataAdministration;

public class Controller implements ActionListener
{
	private DataAdministration dataadmin;
	private DataReader datareader;
	
	public Controller(DataAdministration dataadmin,DataReader datareader)
	{
		this.dataadmin=dataadmin;
		this.datareader=datareader;
		
		this.dataadmin.addAction(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			String path=this.dataadmin.getFilePath();
			String tablename=this.dataadmin.getTableName();
			
			if(path==null)
			{
				JOptionPane.showMessageDialog(dataadmin, "File Path cannot be Empty.");
			}
			else if(tablename==null)
			{
				JOptionPane.showMessageDialog(dataadmin, "Table name cannot be Empty.");
			}
			else
			{
			this.datareader.readData(path);
			this.datareader.viewData();
			//this.dataadmin.setJTable(this.datareader.getData(),this.datareader.getHeader());
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(dataadmin, ex, "Error", 1, null);
		}
	}
	
}
