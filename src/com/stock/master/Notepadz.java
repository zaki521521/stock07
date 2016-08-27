package com.stock.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadz {

	public static void main(String[] args) throws IOException
	{
		
		 Stock_Lib SL=new Stock_Lib();
			
			String Res=SL.openApp("http://webapp.qedgetech.com");
	             System.out.println(Res);
	             Res= SL.logIn("admin","master");
	             System.out.println(Res);
	             
	             
		String Fpath="D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\Uom.txt";
		String rpath="D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\resultz.txt";
		FileReader fr= new FileReader(Fpath);
		BufferedReader br= new BufferedReader(fr);
		String firstli= br.readLine();
		System.out.println(firstli);
		FileWriter fw= new FileWriter(rpath);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(firstli  +"$$$" +"results");
		bw.newLine();
		String SD;
		while((SD=br.readLine())!=null)
		{
			
			System.out.println(SD);
			String[] SR=SD.split("###");
			String EID= SR[0];
			System.out.println(EID);
			String Edesc=SR[1];
			System.out.println(Edesc);
			String ress=SL.unitOfMeasur(EID,Edesc);
			bw.write(EID +"&&&" +Edesc +"***" +ress);
			bw.newLine();
			
			
			
		}
		bw.close();
		fw.close();
		
	}
	
}