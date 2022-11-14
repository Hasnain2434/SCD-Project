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
			this.dataadmin.getFilePath();
			this.dataadmin.getTableName();
			
			this.datareader.readData(this.dataadmin.getFilePath());
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(dataadmin, ex, "Error", 1, null);
		}
	}
	
}
