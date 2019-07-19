package home.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
	
	private WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void launch(String browserName) {
		if(browserName.equals("Chrome")) {
			driver= new ChromeDriver();
		}else if(browserName.equals("Firefox")){
			//Neeed to setup the sytem property for driuver.firefox.
			driver= new FirefoxDriver();
		}
		
		System.out.println("Browser opened");
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	

}
