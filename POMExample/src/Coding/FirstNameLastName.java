package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstNameLastName {

	WebDriver driver;
	
	By uname = By.id("txtUserName");
	By pwd = By.id("txtPassword");
	
	public FirstNameLastName(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public By getUname() {
		return uname;
	}

	public void setUname(By uname) {
		driver.findElement(uname).sendKeys("Nilesh");
	}

	public By getPwd() {
		return pwd;
	}

	public void setPwd(By pwd) {
		driver.findElement(pwd).sendKeys("sco");
	}
	
	
}
