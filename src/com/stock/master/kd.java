package com.stock.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class kd {
public static void main(String[] args)throws IOException
{
	Stock_Lib sl = new Stock_Lib ();
	String st =null;
	String xlpath ="D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\keyword_data.xlsx";
	
	
	FileInputStream fi=new FileInputStream(xlpath);
	
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet ws1= wb.getSheet("TestCase");
	XSSFSheet ws2= wb.getSheet("TestSteps");
	XSSFSheet ws3= wb.getSheet("Testdata");
	
	int ws1rc= ws1.getLastRowNum();
	int ws2rc= ws2.getLastRowNum();
	
	for(int i=1;i<=ws1rc;i++)
	{
		String exe= ws1.getRow(i).getCell(2).getStringCellValue();
		
		if(exe.equalsIgnoreCase("Y"))
		{
		String tcws1 = ws1.getRow(i).getCell(0).getStringCellValue();
		for (int j=1;j<=ws2rc ;j++)
		{
			String tcws2 = ws2.getRow(i).getCell(0).getStringCellValue();
			
			if(tcws1.equalsIgnoreCase(tcws2))
			{
			String key =	ws2.getRow(i).getCell(3).getStringCellValue();
			switch(key)
			{
				case "sLanch" :
				 st= 	sl.openApp("http://webapp.qedgetech.com");
				break;
					
				
				default:
					System.out.println("Pass a Valid Keyword");
					break;
			}
			ws2.getRow(j).createCell(4).setCellValue(st);
				
			}
			
			
		}
			
		}
		
	
	

	}

	
}
	
}

