package objRepPractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ObjProp {
@Test
public void mytest() throws Exception{
	File src = new File("./config.properties/myProp.property");
	FileInputStream fis = new FileInputStream(src);
	Properties pro = new Properties();
	pro.load(fis);
	WebDriver driver = new FirefoxDriver();
	String url = pro.getProperty("url");
	driver.get(url);
	driver.findElement(By.id(pro.getProperty("fname"))).sendKeys(pro.getProperty("name"));
	driver.findElement(By.id(pro.getProperty("lname"))).sendKeys("Kalwar");
	Thread.sleep(2000);
}
}
