package testCases;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.FileDataReaderModel;

class TestCasesUC1 {

	@Test
	void testUnvocalized() 
	{
		FileDataReaderModel temp=new FileDataReaderModel();
		Assertions.assertEquals(temp.makeUnvocalized("مُقَفّاة"), "مقفاة");
	}
	@Test
	void testGetData()
	{
		FileDataReaderModel temp=new FileDataReaderModel();
		Assertions.assertNull(temp.getData());
	}
	
	@Test
	void testGetHeader()
	{
		FileDataReaderModel temp=new FileDataReaderModel();
		Assertions.assertNull(temp.getcolumnNames());
	}
}
