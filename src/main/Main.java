package main;

import controller.Controller;
import controller.ParameterObject;
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
		ParameterObject parameterObject=new ParameterObject(dataAdminView, meaningAdminView, searchWordView, customDictionaryView);
		
		ownObject.IntializeViewsForScreenDirection(parameterObject);
		FileDataReaderModel dataReaderModel=new FileDataReaderModel();
		MeaningAdminModel meaningAdminModel=new MeaningAdminModel();
		SearchWordModel searchWordModel=new SearchWordModel();
		Controller controller=new Controller(parameterObject,dataReaderModel,meaningAdminModel,searchWordModel);
	}
	
	//extract function
	public void IntializeViewsForScreenDirection(ParameterObject parameterObject)
	{
		parameterObject.dataAdminView.setmeaningAdminView(parameterObject.meaningAdminView);
		parameterObject.dataAdminView.setSearchView(parameterObject.searchWordView);
		parameterObject.dataAdminView.setCustomDictionaryView(parameterObject.customDictionaryView);
		parameterObject.searchWordView.setCustomDictionaryView(parameterObject.customDictionaryView);
		parameterObject.searchWordView.setDataAdminView(parameterObject.dataAdminView);
		parameterObject.searchWordView.setMeaningAdminView(parameterObject.meaningAdminView);
		parameterObject.meaningAdminView.setCustomDictionaryView(parameterObject.customDictionaryView);
		parameterObject.meaningAdminView.setSearchView(parameterObject.searchWordView);
		parameterObject.meaningAdminView.setDataAdminView(parameterObject.dataAdminView);
		parameterObject.customDictionaryView.setSearchView(parameterObject.searchWordView);
		parameterObject.customDictionaryView.setDataAdminView(parameterObject.dataAdminView);
		parameterObject.customDictionaryView.setMeaningAdminView(parameterObject.meaningAdminView);
	}
	
}
