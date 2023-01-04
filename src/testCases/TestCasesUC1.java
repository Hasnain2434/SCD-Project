package testCases;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dataAccessLayerPERSISTENTLAYER.DataBaseAccessor;
import dataAccessLayerPERSISTENTLAYER.DataBaseAccessorInterface;
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
	@Test
	void testFetchColumnNamesFromTable()
	{
		FileDataReaderModel temp=new FileDataReaderModel();
		temp.fetchColumnNamesFromTable("faeel");
		Assertions.assertNotNull(temp.getcolumnNames());
	}
	
	@Test
	void testGetNumberOfTableColumns()
	{
		DataBaseAccessorInterface temp=new DataBaseAccessor();
		Assertions.assertEquals(temp.getNumberOfTableColumns("faeel"),10);
	}
	
}
