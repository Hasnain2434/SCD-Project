package main;

import controller.Controller;
import model.SearchWordModel;
import model.FileDataReaderModel;
import view.DataAdminView;
import view.SearchWordView;
import view.SplashScreen;

public class Main {
/**
 * Entry point of program
 * @param args
 */
	public static void main(String[] args) {
		
		SplashScreen splashScreen=new SplashScreen();
		splashScreen.animateProgressBar();
		splashScreen.setVisible(false);
		DataAdminView dataAdminView=new DataAdminView(); 
		SearchWordView searchWordView=new SearchWordView();
		dataAdminView.setSecondView(searchWordView);
		searchWordView.setFirstView(dataAdminView);
		FileDataReaderModel dataReaderModel=new FileDataReaderModel();
		SearchWordModel searchWordModel=new SearchWordModel();
		Controller c=new Controller (dataAdminView,dataReaderModel,searchWordView,searchWordModel);
		
	}
	
}
