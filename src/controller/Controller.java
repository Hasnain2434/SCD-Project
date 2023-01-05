package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.FileDataReaderModel;
import model.MeaningAdminModel;
import model.SearchWordModel;
import view.SearchWordView;
import view.CustomDictionaryView;
import view.DataAdminView;
import view.MeaningAdminView;

public class Controller implements ActionListener
{
	private DataAdminView dataadmin;
	private FileDataReaderModel fileDataReaderModel;
	private MeaningAdminView meaningAdminView;
	private MeaningAdminModel meaningAdminModel;
	private SearchWordView searchWordView;
	private SearchWordModel searchWordModel;
	private CustomDictionaryView customDictionaryView;
	private String tableName;
	
	public Controller(ParameterObject parameterObject,FileDataReaderModel fileDataReaderModel,MeaningAdminModel meaningAdminModel,SearchWordModel searchWordModel)
	{
		this.dataadmin=parameterObject.dataAdminView;
		this.fileDataReaderModel=fileDataReaderModel;
		this.meaningAdminView=parameterObject.meaningAdminView;
		this.meaningAdminModel=meaningAdminModel;
		this.searchWordView=parameterObject.searchWordView;
		this.searchWordModel=searchWordModel;
		this.customDictionaryView=parameterObject.customDictionaryView;
		this.tableName="";
		this.dataadmin.addAction(this);
		this.meaningAdminView.addAction(this);
		this.searchWordView.addAction(this);
		this.customDictionaryView.addAction(this);
		this.meaningAdminView.setColumnFields(meaningAdminModel.getColumnCount("faeel"));
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
			this.actionHandlerButtonImport();
		}
		else if(e.getActionCommand().equals("MakeSearch"))
		{
			this.actionHandlerButtonMakeSearch();
		}
		else if(e.getActionCommand()=="dictionary")
		{
			this.actionHandlerButtonDictionary();
		}
		else
		{
			this.actionHandlerButtonMeaning(e);
		}
	}
	
	
	
	
	
	
	
	
	private void actionHandlerButtonImport()
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
	private void actionHandlerButtonMakeSearch()
	{

		searchWordView.emptyJTable();
		if(searchWordView.checkEmptyTextField()==false)
		{
		if(searchWordView.getSearchViaRoot()==true)
		{
			
			searchWordView.setJTable(searchWordModel.SearchWord(searchWordView.getword(),"Root"), meaningAdminModel.getColumnNames("faeel"));
		}
		else if(searchWordView.getSearchViaWord()==true)
		{
			searchWordView.setJTable(searchWordModel.SearchWord(searchWordView.getword(),"بغیر_اعراب_مشکول"), meaningAdminModel.getColumnNames("faeel"));
		}
		else if(searchWordView.getSearchViaMeaning()==true)
		{
			searchWordView.setJTable(searchWordModel.SearchWord(searchWordView.getword(),"معنی"), meaningAdminModel.getColumnNames("faeel"));
		}
		else
		{
			JOptionPane.showMessageDialog(searchWordView, "Choose any Radio Button to search");
		}
		}
		else
		{
			JOptionPane.showMessageDialog(searchWordView, "Enter something to search");
		}
	
	}

	private void actionHandlerButtonDictionary()
	{

		if(!customDictionaryView.checkEmptyTextField())
		{
		customDictionaryView.makeTranslationBoxEmpty();
		String[] line=customDictionaryView.getTextFieldText();
		String translation[]=new String[line.length];
		for(int i=0;i<line.length;i++)
		{
			translation[i]=searchWordModel.getSingleMeaningFromDatabase(line[i]);
		}
		customDictionaryView.setTranslationBoxText(String.join(" " , translation));
		}
		else
		{
			JOptionPane.showMessageDialog(customDictionaryView, "Please Enter the Sentence");
		}
		
	
	}
	private void actionHandlerButtonMeaning(ActionEvent e)
	{

		try
		{
			String word=meaningAdminView.getword();
			String meaning = meaningAdminView.getMeaning();
			if(word.equals(""))
				JOptionPane.showMessageDialog(meaningAdminView, "Enter word First\n");
			else {
				tableName = meaningAdminModel.getTableNameofWord(word);
				if(tableName.equals("")) {
					JOptionPane.showMessageDialog(meaningAdminView, "No such word Found in DataBase\n");
					makeEmpty();
					meaningAdminView.EmptyMeaning();
				}
				else {
					if(e.getSource() == meaningAdminView.btnNewButton) {
						setRowData(word,tableName);
						
						meaningAdminView.setRootsList(meaningAdminModel.getRoots(word, tableName));
					}
						
					else if(e.getSource() == meaningAdminView.btnNewButton_1) {
						if(meaning==null)
							JOptionPane.showMessageDialog(meaningAdminView, "Meaning cannot be Empty.");
						else 
							meaningAdminModel.insertMeanings(word, meaning, tableName);
					}
					else if(e.getSource() == meaningAdminView.comboBox) {
						if(!(meaningAdminView.getSelected() == null))
						meaningAdminModel.updateRoots(meaningAdminView.getSelected(), word, tableName);
								
					}
				}}
			}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(meaningAdminView, ex, "Error", 1, null);
		}
	
	}
	
	private void makeEmpty() {
		
		int count = meaningAdminModel.getColumnCount("faeel");
		
		for(int i=0; i < count; i++)
		{
			meaningAdminView.attrtextField.get(i).setText("");
		}
	}

	public void setColumnNames(String tableName) {
		ArrayList <String> columnNames = new ArrayList<String>();
		columnNames = meaningAdminModel.getColumnNames(tableName);
		int count = meaningAdminModel.getColumnCount(tableName);
		for(int i=0; i < count; i++)
		{
			meaningAdminView.attrlbl.get(i).setText(columnNames.get(i));
		}
	}
	public void setRowData(String word,String tableName) {
		ArrayList <String> rowData = new ArrayList<String>();
		rowData = meaningAdminModel.getRowData(word,tableName);
		int count = meaningAdminModel.getColumnCount(tableName);
		
		for(int i=0; i < count; i++)
		{
			meaningAdminView.attrtextField.get(i).setText(rowData.get(i));
		}
	}

	
}
