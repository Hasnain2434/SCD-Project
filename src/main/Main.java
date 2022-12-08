package main;

import controller.Controller;
import model.FileDataReaderModel;
import view.DataAdminView;
import view.SplashScreen;

public class Main {
/**
 * Entry point of program
 * @param args
 */
	public static void main(String[] args) {
		
		SplashScreen s=new SplashScreen();
		s.animateProgressBar();
		s.setVisible(false);
		DataAdminView d=new DataAdminView(); 
		FileDataReaderModel r=new FileDataReaderModel();
		Controller c=new Controller (d,r);
		
	}
	
}
