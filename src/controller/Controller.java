package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.FileDataReaderModel;
import model.SearchWordModel;
import view.DataAdminView;
import view.SearchWordView;

public class Controller implements ActionListener
{
	private DataAdminView dataadmin;
	private FileDataReaderModel fileDataReaderModel;
	private SearchWordView searchWordView;
	private SearchWordModel searchWordModel;
	private String tableName;
	
	public Controller(DataAdminView dataAdmin,FileDataReaderModel fileDataReaderModel,SearchWordView searchWordView,SearchWordModel searchWordModel)
	{
		this.dataadmin=dataAdmin;
		this.fileDataReaderModel=fileDataReaderModel;
		this.searchWordView=searchWordView;
		this.searchWordModel=searchWordModel;
		this.tableName="";
		
		this.dataadmin.addAction(this);
		this.searchWordView.addAction(this);
		this.searchWordView.setColumnFields(searchWordModel.getColumnCount("faeel"));
		this.setColumnNames("faeel");
	}
	/**
	 * this function defines what to do when the certain button is pressed
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("Import"))
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
			this.dataadmin.setJTable(this.fileDataReaderModel.getData(),this.fileDataReaderModel.getcolumnNames());
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(dataadmin, "Error in importing file", "Error", 1, null);
		}
		}
		else
		{
			try
			{
				String word=searchWordView.getword();
				String meaning = searchWordView.getMeaning();
				if(word.equals(""))
					JOptionPane.showMessageDialog(searchWordView, "Enter word First\n");
				else {
					tableName = searchWordModel.getTableNameofWord(word);
					if(tableName.equals("")) {
						JOptionPane.showMessageDialog(searchWordView, "No such word Found in DataBase\n");
						makeEmpty();
						searchWordView.EmptyMeaning();
					}
					else {
						if(e.getSource() == searchWordView.btnNewButton) {
							setRowData(word,tableName);
							
							searchWordView.setRootsList(searchWordModel.getRoots(word, tableName));
						}
							
						else if(e.getSource() == searchWordView.btnNewButton_1) {
							if(meaning==null)
								JOptionPane.showMessageDialog(searchWordView, "Meaning cannot be Empty.");
							else 
								searchWordModel.insertMeanings(word, meaning, tableName);
						}
						else if(e.getSource() == searchWordView.comboBox) {
							if(!(searchWordView.getSelected() == null))
							searchWordModel.updateRoots(searchWordView.getSelected(), word, tableName);
									
						}
					}}
				}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(searchWordView, ex, "Error", 1, null);
			}
		}
	}
	
	private void makeEmpty() {
		// TODO Auto-generated method stub
		
		int count = searchWordModel.getColumnCount("faeel");
		
		for(int i=0; i < count; i++)
		{
			searchWordView.attrtextField.get(i).setText("");
		}
	}

	public void setColumnNames(String tableName) {
		ArrayList <String> columnNames = new ArrayList<String>();
		columnNames = searchWordModel.getColumnNames(tableName);
		int count = searchWordModel.getColumnCount(tableName);
		for(int i=0; i < count; i++)
		{
			searchWordView.attrlbl.get(i).setText(columnNames.get(i));
		}
	}
	public void setRowData(String word,String tableName) {
		ArrayList <String> rowData = new ArrayList<String>();
		rowData = searchWordModel.getRowData(word,tableName);
		int count = searchWordModel.getColumnCount(tableName);
		
		for(int i=0; i < count; i++)
		{
			searchWordView.attrtextField.get(i).setText(rowData.get(i));
		}
	}

	
}
