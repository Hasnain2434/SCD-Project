package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import files_classes.Mafoul;
import files_classes.Masdar;



public class DataReader {
	private ArrayList<Mafoul> masdar;
	
	public DataReader()
	{
		masdar=new ArrayList<Mafoul>();
	}
	public void readData(String path)
	{
		String line = "";  
		String splitBy = ",";
		Mafoul temporaryobject;
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		File file=new File(path);
		FileReader filereader=new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);  
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{
		temporaryobject=new Mafoul();
		String[] employee = line.split(splitBy);    // use comma as separator  
		temporaryobject.setرقم(Integer.parseInt(employee[0]));
		temporaryobject.setمشكول(employee[1]);
		temporaryobject.setصنف(employee[2]);
		temporaryobject.setأصل(employee[3]);
		temporaryobject.setجنس(employee[4]);
		temporaryobject.setعدد(employee[5]);
		//temporaryobject.setعاقل(employee[6]);
		//temporaryobject.setتنون_النصب_للجمع(employee[7]);
		//temporaryobject.setشرح(employee[8]);
		System.out.println(employee[0]+" , "+employee[1]+" , "+employee[2]+" , "+employee[3]+" , "+employee[4]+" , "+employee[5]);
		masdar.add(temporaryobject);
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
	}
	
	public void viewData()
	{
		for(Mafoul m:masdar)
		{
			//System.out.println(m.getرقم()+" "+m.getمشكول()+" "+m.getصنف()+" "+m.getأصل()+" "+m.getعدد()+" , "+m.getعاقل()+" , "+m.getتنون_النصب_للجمع()+" , "+m.getشرح());
			System.out.println(m.getرقم()+" "+m.getمشكول()+" "+m.getصنف()+" "+m.getأصل()+" "+m.getعدد()+" "+m.getجنس());
		}
	}
}
