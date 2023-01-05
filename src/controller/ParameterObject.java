package controller;

import model.FileDataReaderModel;
import model.MeaningAdminModel;
import model.SearchWordModel;
import view.CustomDictionaryView;
import view.DataAdminView;
import view.MeaningAdminView;
import view.SearchWordView;

public class ParameterObject {
	public DataAdminView dataAdminView;
	public MeaningAdminView meaningAdminView;
	public SearchWordView searchWordView;
	public CustomDictionaryView customDictionaryView;
	public ParameterObject(DataAdminView dataadmin, MeaningAdminView meaningAdminView, SearchWordView searchWordView,CustomDictionaryView customDictionaryView) {
		super();
		this.dataAdminView = dataadmin;
		this.meaningAdminView = meaningAdminView;
		this.searchWordView = searchWordView;
		this.customDictionaryView = customDictionaryView;
	}
}
