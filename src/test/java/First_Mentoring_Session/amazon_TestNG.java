package First_Mentoring_Session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class amazon_TestNG {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books best sellers new releases 2022");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.partialLinkText("Jess")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/a/span")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium'])[1]")).click();
		Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naark\\eclipse-workspace\\sel.project\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
