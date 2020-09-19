 package com.sellabs.TestngExam;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.*;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;


public class DataProviderCh {
	
	@Test(dataProvider="test")
	public void test1(String val1,String val2,String val3) {
		int a=Integer.parseInt(val1);
		int b=Integer.parseInt(val2);
		int c=Integer.parseInt(val3);
		System.out.println(a+b+c);
	}

   @DataProvider(name= "test")
   public Object[][] checktest() throws Exception, IOException{
	   File f=new File("G:\\Eclipse_Workspace\\Task\\input.xls");
	   Workbook wb=Workbook.getWorkbook(f);
	   Sheet s=wb.getSheet("Sheet1");
	   int row=s.getRows();
	   int column=s.getColumns();
	   String[] [] str= new String[row][column];
	   for(int i=0;i<row;i++) {
		   for(int j=0;j<column;j++) {
			   Cell c=s.getCell(j, i);
			   str[i][j]=c.getContents();
		   }
	   }
	   
	return str;
	   
   }
}
