package main;

import controller.Controller;
import model.FileDataReaderModel;
import model.MeaningAdminModel;
import model.SearchWordModel;
import view.CustomDictionaryView;
import view.DataAdminView;
import view.MeaningAdminView;
import view.SearchWordView;
import view.SplashScreen;

public class Main {
/**
 * Entry point of program
 * @param args
 */
	public static void main(String[] args) {
		
		Main ownObject=new Main();
		SplashScreen splashScreen=new SplashScreen();
		splashScreen.animateProgressBar();
		splashScreen.setVisible(false);
		DataAdminView dataAdminView=new DataAdminView(); 
		MeaningAdminView meaningAdminView=new MeaningAdminView();
		SearchWordView searchWordView=new SearchWordView();
		CustomDictionaryView customDictionaryView=new CustomDictionaryView();
		ownObject.IntializeViewsForScreenDirection(dataAdminView, meaningAdminView, searchWordView, customDictionaryView);
		FileDataReaderModel dataReaderModel=new FileDataReaderModel();
		MeaningAdminModel meaningAdminModel=new MeaningAdminModel();
		SearchWordModel searchWordModel=new SearchWordModel();
		Controller c=new Controller (dataAdminView,dataReaderModel,meaningAdminView,meaningAdminModel,searchWordView,searchWordModel,customDictionaryView);
		
	}
	
	public void IntializeViewsForScreenDirection(DataAdminView dataAdminView,MeaningAdminView meaningAdminView,SearchWordView searchWordView,CustomDictionaryView customDictionaryView)
	{
		dataAdminView.setmeaningAdminView(meaningAdminView);
		dataAdminView.setSearchView(searchWordView);
		dataAdminView.setCustomDictionaryView(customDictionaryView);
		searchWordView.setCustomDictionaryView(customDictionaryView);
		searchWordView.setDataAdminView(dataAdminView);
		searchWordView.setMeaningAdminView(meaningAdminView);
		meaningAdminView.setCustomDictionaryView(customDictionaryView);
		meaningAdminView.setSearchView(searchWordView);
		meaningAdminView.setDataAdminView(dataAdminView);
		customDictionaryView.setSearchView(searchWordView);
		customDictionaryView.setDataAdminView(dataAdminView);
		customDictionaryView.setMeaningAdminView(meaningAdminView);
	}
	
}
