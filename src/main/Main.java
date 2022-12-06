package main;

import controller.Controller;
import model.FileDataReaderModel;
import view.DataAdminView;

public class Main {
/**
 * Entry point of program
 * @param args
 */
	public static void main(String[] args) {
		
		
		  DataAdminView d=new DataAdminView(); 
		  FileDataReaderModel r=new FileDataReaderModel();
		  Controller c=new Controller (d,r);
		
	}
	
}
