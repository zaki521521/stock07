package com.stock.master;

public class nodes {

	
	/*nodes
	 
	 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  <test name="On Firefox">
  <parameter name="Browser" value="firefox"></parameter>
    <classes>
      <class name="com.stock.master.grid"/>
    </classes>
  </test> <!-- Gexe -->
  <test name="On Chrome">
   <parameter name="Browser" value="chrome"></parameter> <classes>
      <class name="com.stock.master.grid"/>
    </classes>
  </test> <!-- Gexe -->
  <test name="On Ie">
  <parameter name="Browser" value="Ie"></parameter>
    <classes>
      <class name="com.stock.master.grid"/>
    </classes>
  </test> <!-- Gexe -->
</suite> <!-- Suite -->


FOR HUB

java -jar selenium-server-standalone-2.53.1.jar -role hub





FOR NODE  (Default firefox) 

java -jar selenium-server-standalone-2.53.1.jar -role Webdriver -hub http://10.0.0.15:4444/grid/register -port 2343



FOR NODE  (Default chrome) 

java -Dwebdriver.chrome.driver=c:\chromedriver.exe
     -jar selenium-server-standalone-2.51.0.jar 
     -role Webdriver 
     -hub http://HUB_IP Adresst:4444/grid/register 
     -port 6666 
     -browser browserName="chrome",maxInstances=5



FOR NODE  (Default chrome and IE)


java -Dwebdriver.chrome.driver=c:\chromedriver.exe
     -Dwebdriver.ie.driver=c:\IEDriverserver.exe
     -jar selenium-server-standalone-2.51.0.jar 
     -role Webdriver 
     -hub http://HUB_IP Adress:4444/grid/register 
     -port 7777
     -browser browserName="ie",maxInstances=5

 







x




	 
	 */
}
