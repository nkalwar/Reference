package objRepPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XmlExp {
 @Test
 public void mytest() throws FileNotFoundException, DocumentException, InterruptedException{
	 File src=new File("./myData.xml");
	 FileInputStream fis = new FileInputStream(src);
	 SAXReader saxReader = new SAXReader();
	 Document document = saxReader.read(fis);
	 WebDriver driver = new FirefoxDriver();
	 driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/AdvanceSelenium/WorkingWithForms.html");
	 driver.findElement(By.id(document.selectSingleNode("//Login/username").getText())).sendKeys("Nilesh");
	 driver.findElement(By.id(document.selectSingleNode("//Login/lastname").getText())).sendKeys("kalwar");
 }
}
