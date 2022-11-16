package main;

import controller.Controller;
import model.DataReader;
import view.DataAdminView;

public class Main {

	public static void main(String[] args) {
		
		
		  DataAdminView d=new DataAdminView(); 
		  DataReader r=new DataReader();
		  Controller c=new Controller (d,r);
		 
		
	}
	


}
