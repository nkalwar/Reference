package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class coding {
	WebDriver driver;
	
	public coding(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id = "txtFirstName")
	@CacheLookup
	WebElement Fname;
	
	@FindBy(how=How.ID,using="txtLastName")
	@CacheLookup
	WebElement Lname;
	
	public void iamTyping(String fname,String lname){
		Fname.sendKeys(fname);
		Lname.sendKeys(lname);
	}
	
	
}
