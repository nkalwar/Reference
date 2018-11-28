import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdriver {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/AdvanceSelenium/WorkingWithForms.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Email Registration Form";
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Matches");
		}
		else{
			System.out.println("Not matches");
		}
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
		String expectedHeading = "Email Registration";
		
		if(driver.findElement(By.xpath("html/body/h1")).getText().contentEquals(expectedHeading)){
			System.out.println("Heading Matches");
		}
		else{
			System.out.println("Not matches");
		}
		
		
		driver.close();
	}
}
