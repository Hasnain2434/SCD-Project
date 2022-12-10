package main;

import controller.Controller;
import model.FileDataReaderModel;
import model.MeaningAdminModel;
import model.SearchWordModel;
import view.SearchWordView;
import view.DataAdminView;
import view.MeaningAdminView;
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
		MeaningAdminView meaningAdminView=new MeaningAdminView();
		SearchWordView searchWordView=new SearchWordView();
		dataAdminView.setmeaningAdminView(meaningAdminView);
		dataAdminView.setSearchView(searchWordView);
		searchWordView.setDataAdminView(dataAdminView);
		searchWordView.setMeaningAdminView(meaningAdminView);
		meaningAdminView.setSearchView(searchWordView);
		meaningAdminView.setDataAdminView(dataAdminView);
		FileDataReaderModel dataReaderModel=new FileDataReaderModel();
		MeaningAdminModel meaningAdminModel=new MeaningAdminModel();
		SearchWordModel searchWordModel=new SearchWordModel();
		Controller c=new Controller (dataAdminView,dataReaderModel,meaningAdminView,meaningAdminModel,searchWordView,searchWordModel);
		
	}
	
}
