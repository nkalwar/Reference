package HotelBookingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
	private static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\AdvanceSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1B/Desktop/AdvanceSelenium/WorkingWithForms.html");
	}
}