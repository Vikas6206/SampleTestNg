package home.TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class GoogleDropdown {
	
	private WebDriver driver;
  @Test
  public void f() {
	 System.out.print("Debug test");
	 WebDriverWait wait = new WebDriverWait(driver, 15);
	 
	 WebElement inputFieldQ = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='q']")));
	 inputFieldQ.sendKeys("cars");
	 
  
  }
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
