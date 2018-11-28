package newweb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chkRemote {
	public static void main(String[] args) throws InterruptedException, MalformedURLException{
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		//capabilities.setCapability("firefox_binary","");
		capabilities.setPlatform(Platform.ANY);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://10.220.56.23:5555/wd/hub"), capabilities);
		
		try{
			driver.get("file://localhost/D:/Users/ADM-IG-HWDLAB1B/Desktop/AdvanceSelenium/WorkingWithForms.html");
			System.out.println(driver.getTitle());
			//driver.quit();
		}
		catch(Exception ex){
			System.out.println("Hello");
		}
	}
}
