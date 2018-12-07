package com.autobots.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autobots.pages.FirePages;



public class FireBuggiesTest {
	
	WebDriver driver;
	
	@BeforeClass
	public  void ChromeStart()
	{
		System.setProperty("webdriver.chrome.driver","D:/Users/ADM-IG-HWDLAB1B/Desktop/chrome/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
	}
	
	/*public  void FirefoxStart()
	{
		driver= new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
	}*/
	
	
	@Test
	  public void testMethod() throws Exception
	  {
	   
		FirePages p = PageFactory.initElements(driver, FirePages.class);

	    /*----------------Read Data From XML File------------------------------------------*/ 
		
		File src= new File("./Config/ResultAndData.xml");
		FileInputStream fis = new FileInputStream(src);
		
		SAXReader saxreader = new SAXReader();
		Document document = saxreader.read(fis);
		 File src1= new File("./Config/pro.property");
		  FileInputStream fis1 = new FileInputStream(src1);
		  //to read the property file create an object of properties class
		  Properties pro= new Properties();
		  // to load property file 
		  pro.load(fis1);
		
	    p.Click(document.selectSingleNode("//goibibo/path/roundtrip").getText());
		
	    p.SendValues(p.getXmlValue(document, pro.getProperty("xmlData")),p.getXmlValue(document, pro.getProperty("xmlPath")));
	    
	    p.SendValues(p.getXmlValue(document, pro.getProperty("xmlData1")),p.getXmlValue(document, pro.getProperty("xmlData1")));
	    
	    p.Click(document.selectSingleNode(pro.getProperty("xmlPath2")).getText());
	   
	    p.Click(document.selectSingleNode(pro.getProperty("xmlPath3")).getText());
	   
	   p.Click(document.selectSingleNode(pro.getProperty("xmlPath4")).getText());
	   
	   p.Click(document.selectSingleNode(pro.getProperty("xmlPath5")).getText());
	   
	   p.Click(document.selectSingleNode(pro.getProperty("xmlPath6")).getText());
	   
	   p.Click(document.selectSingleNode(pro.getProperty("xmlPath7")).getText());
	   
	   p.Click(document.selectSingleNode(pro.getProperty("xmlPath8")).getText());
	   
	   p.DropDown(document.selectSingleNode("//goibibo/path/Class").getText(), "B");
	   
	   p.Click(document.selectSingleNode("//goibibo/path/pricechange").getText());
	   
	   p.Click(document.selectSingleNode("//goibibo/path/setgo").getText());
	   
	   p.Click(document.selectSingleNode("//goibibo/path/Tbook").getText());
	   
	   
	   
	   
	  
     }
	
	@AfterClass
	public void Last() throws InterruptedException
	{
		Thread.sleep(4000);
		//driver.close();
	}
	
}
