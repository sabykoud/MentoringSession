package TestNG_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Test_Case {
	public static WebDriver driver;
	@BeforeTest
	
	public void browserssetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		
	}
  @Test
  public void loginwithnopassword() {
	  driver.findElement(By.className("signin")).click();
	  driver.findElement(By.name("login")).sendKeys("sabrinakoud@hotmail.com");
	  driver.findElement(By.className("signinbtn")).click();
	  
  }
  
  @Test
  public void logingwithtruecredentials() {
	  
	  
	  
	  
  }
  
  
  
}
