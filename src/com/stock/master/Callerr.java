package com.stock.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Callerr {

	public static void main(String[] args) throws IOException {

		Stock_Lib sl=new Stock_Lib();
		
		String result=sl.openApp("http://webapp.qedgetech.com");
  //System.out.print(result);
  
  String  Loginresult =sl.logIn("admin","master");
  
 // System.out.print(Loginresult);
  
  
  /*sl.suppliers();
  
  
  sl.supliersearchAndstockItems();*/
    //sl.unitOfMeasur(); 
  
  FileInputStream fis= new FileInputStream("D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\UM.xlsx");

  XSSFWorkbook wb= new XSSFWorkbook(fis);
  
  XSSFSheet ws=wb.getSheet("Sheet1");
  
  int rc= ws.getLastRowNum();
  for(int i=1; i<=rc;i++)
  {
  	XSSFRow wr=ws.getRow(i);
  	
  	XSSFCell wc= wr.getCell(0);
  	XSSFCell wc2= wr.getCell(1);
  	XSSFCell wc3= wr.createCell(2);
               
  	
  	String uid=wc.getStringCellValue();
  	String udesc=wc2.getStringCellValue();
  	

 String result1= sl.unitOfMeasur(uid,udesc);
 System.out.println(result1);
 wc3.setCellValue(result1);		
  }
  FileOutputStream Fos=new FileOutputStream("D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\UM.xlsx");
  wb.write(Fos);
  wb.close();
   


  //sl.dclose();
	}

	
	
}
