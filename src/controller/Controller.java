package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.FileDataReaderModel;
import view.DataAdminView;

public class Controller implements ActionListener
{
	private DataAdminView dataadmin;
	private FileDataReaderModel fileDataReaderModel;
	
	
	public Controller(DataAdminView dataadmin,FileDataReaderModel fileDataReaderModel)
	{
		this.dataadmin=dataadmin;
		this.fileDataReaderModel=fileDataReaderModel;
		
		
		this.dataadmin.addAction(this);
	}
	/**
	 * this function defines what to do when the certain button is pressed
	 */
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
			this.dataadmin.emptyJTable();
			this.fileDataReaderModel.insertData(path, tablename);
			//for table
			this.dataadmin.setJTable(this.fileDataReaderModel.getData(),this.fileDataReaderModel.getcolumnNames());
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(dataadmin, "Error in importing file", "Error", 1, null);
		}
	}
	
}
