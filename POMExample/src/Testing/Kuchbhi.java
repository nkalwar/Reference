package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Kuchbhi {
  @Test
  public void f() throws Exception{
  
	  File src = new File("./Configuration/myFile1.property");
	  FileInputStream fis = new FileInputStream(src);
	  Properties pro = new Properties();
	  pro.load(fis);
	  
	  WebDriver driver = new FirefoxDriver();
	  String url = pro.getProperty("_url");
	  driver.get(url);
	  
	  driver.findElement(By.id(pro.getProperty("user_name"))).sendKeys("Nilesh");
	  driver.findElement(By.id(pro.getProperty("password"))).sendKeys("cap");
	  }
}
