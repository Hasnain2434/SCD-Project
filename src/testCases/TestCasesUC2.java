package testCases;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dataAccessLayerPERSISTENTLAYER.DataBaseAccessor;
import dataAccessLayerPERSISTENTLAYER.DataBaseAccessorInterfaceManageWord;
import dataAccessLayerPERSISTENTLAYER.DataBaseAccessorManageWord;

class TestCasesUC2 {
	DataBaseAccessorInterfaceManageWord dba = new DataBaseAccessorManageWord();
	@Test
	void testColumnCount() 
	{
		Assertions.assertEquals(10,dba.countColumns("faeel")); 
	}
	 
	
	@Test
	void testColumnNames() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("رقم");
		list.add("مشكول");
		list.add("Root");
		list.add("بغیر_اعراب_مشکول");
		list.add("صنف");
		list.add("أصل");
		list.add("بغیر_اعراب_أصل");
		list.add("جنس");
		list.add("عدد");
		list.add("معنی");
		Assertions.assertEquals(list,dba.returnColumnNames("faeel"));
		
	}
	@Test
	void testBoolWordFound() {
		Assertions.assertFalse(dba.wordFound("hello","faeel"));
	}
	
	@Test
	void testRowData() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("500");
		list.add("FMashkool2");
		list.add("FRoot2");
		list.add("FWord2");
		list.add("FSinf");
		list.add("Fasal2");
		list.add("FBAA");
		list.add("FJins2");
		list.add("FAdad2");
		list.add("Mean2 Mean3 Mean3 Mean3");
		
		Assertions.assertNotEquals(list,dba.getRow("أبرار", "faeel"));
	}
	
	
	
	@Test 
	void getRoot() {
		String [] root = {"وحد"};
		String[] array=dba.getRoots("واحد", "faeel");
		Assertions.assertEquals(root[0],array[0]);
	}
	
	
	
	
	
	
	
	
	
}
