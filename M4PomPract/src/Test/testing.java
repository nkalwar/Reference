package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.coding;

public class testing {
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/AdvanceSelenium/WorkingWithForms.html");
	coding cd=PageFactory.initElements(driver, coding.class);
	cd.iamTyping("Nilesh", "Kalwar");
	
	}
}
