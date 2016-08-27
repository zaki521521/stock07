package com.stock.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Newcl {

	public static void main(String[] args) throws IOException
	{
		Stock_Lib sp= new Stock_Lib();
		
		
		FileReader fr= new FileReader("D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\Sel.txt");

		BufferedReader  br= new BufferedReader(fr);
		
		String Res=sp.openApp("http://webapp.qedgetech.com");
		System.out.println(Res);
		
		
		String fl=br.readLine();
		
		System.out.println(fl);
		
		FileWriter fw= new FileWriter("D:\\Zaki\\ERP\\src\\com\\stock\\testdata\\rest.txt");
		BufferedWriter  bw= new BufferedWriter(fw);
		bw.write(fl + "@@@" + "result");
		bw.newLine();
		String sl;
		while((sl=br.readLine())!=null)
		{
			String[] sb=sl.split("###");
			String un1=sb[0];
			String pwd1=sb[1];
			System.out.println(un1+"  "+pwd1);
			String Login=sp.logIn(un1, pwd1);
			bw.write(un1 +"@@@" +pwd1 +"@@@" +Login);
			bw.newLine();
		
		}
		
		bw.close();
		fw.close();
		
		
		
		
		

		
	}
	
	
	
	
	
}



