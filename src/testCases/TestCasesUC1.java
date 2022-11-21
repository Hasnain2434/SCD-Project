package testCases;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.DataReader;

class TestCasesUC1 {

	@Test
	void testUnvocalized() 
	{
		DataReader temp=new DataReader();
		Assertions.assertEquals(temp.makeUnvocalized("مُقَفّاة"), "مقفاة");
	}
	@Test
	void testGetData()
	{
		DataReader temp=new DataReader();
		Assertions.assertNull(temp.getData());
	}
	
	@Test
	void testGetHeader()
	{
		DataReader temp=new DataReader();
		Assertions.assertNull(temp.getHeader());
	}
}
