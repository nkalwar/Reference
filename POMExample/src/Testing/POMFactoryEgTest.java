package Testing;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Coding.POMFactoryEg;

public class POMFactoryEgTest {

	@Test
	public void f(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file://localhost/D:/Users/ADM-IG-HWDLAB1B/Desktop/AdvanceSelenium/WorkingWithForms.html");
		POMFactoryEg p = PageFactory.initElements(driver, POMFactoryEg.class);
		p.type("kalwar");
	}
}