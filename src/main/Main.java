package main;

import controller.Controller;
import model.DataReader;
import view.DataAdministration;

public class Main {

	public static void main(String[] args) {
		
		DataAdministration d=new DataAdministration();
		DataReader r=new DataReader();
		Controller c=new Controller (d,r);
	}

}
