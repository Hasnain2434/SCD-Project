package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import files_classes.Mafoul;



public class DataReader {
	private List<List<String>> mafoul;
	public DataReader()
	{
		mafoul= new ArrayList<List<String>>();
	}
	public void readData(String path)
	{
		String line = "";  
		String splitBy = ",";
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		File file=new File(path);
		FileReader filereader=new FileReader(file);
		BufferedReader br = new BufferedReader(filereader); 
		int row=0;
		int column;
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{
			String[] columns=line.split(splitBy);
			column=0;
			if(row!=0)
			{
				mafoul.add(new ArrayList<String>());
				while(column<columns.length)
				{
					mafoul.get(row-1).add(columns[column]);
					column++;
				}
			}
			row++;
		}
		br.close();
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}
	}
	
	public void viewData()

	{
		for(int i=0;i<mafoul.size();i++)
		{
			for(int j=0;j<mafoul.get(i).size();j++)
			{
				System.out.print(mafoul.get(i).get(j)+" , ");
			}
			System.out.println();
		}
	}
	
	private String makeUnvocalized(String vocalized)
	{
		
		  String unvocalized=" "; 
		  char[] vocalizedarray=vocalized.toCharArray();
		  char[]
		  temporary=new char[vocalized.length()];
		  for(int i=0;i<vocalized.length();i++)
		  { 
			   
			  unvocalized=String.valueOf(vocalizedarray);
			  System.out.println(unvocalized);
		  }
		  
		return null;
	}
}