package Coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class POMFactoryEg {

	WebDriver driver = new FirefoxDriver();
	
	@FindBy(id = "txtFirstName")
	@CacheLookup
	WebElement Fname;

	public POMFactoryEg(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void type(String fname) {
		Fname.sendKeys(fname);
	}
	
	
}
