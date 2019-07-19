package home.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleDropdown {
	
	private WebDriver driver;
	
	
  @Test
  public void f() {
	 System.out.println("Debug test");
	 WebDriverWait wait = new WebDriverWait(driver, 15);
	 
	 WebElement inputFieldQ = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='q']")));
	 inputFieldQ.sendKeys("cars");
	 
  
  }
  
  @Test(groups = {"smoking"})
  public void secondTest() {
	System.out.println("Inside second test");  
  }
  
  @Test(groups = {"smoking","drinking"})
  public void thirdTest() {
	System.out.println("Inside 3rd test");  
  }
  
  @Test(groups = {"drinking"})
  public void fourthTest() {
	System.out.println("Inside 4th test");  
  }
  
  @Test(groups = {"sleeping"})
  public void fifthTest() {
	System.out.println("Inside 5th test");  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  System.out.println("Inside before class");  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
