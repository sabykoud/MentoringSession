package First_Mentoring_Session;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training_Class {
	public static WebDriver driver; 

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String actualCurentUrl = ("https://amazon.com");
		String expectedCurentUrl = driver.getCurrentUrl();
		System.out.println(actualCurentUrl);
		System.out.println(expectedCurentUrl);
		      
		String title=driver.getTitle();
		System.out.println(title);
		
		List<WebElement> allatag= driver.findElements(By.tagName("input"));
		
        System.out.println(allatag + " ");
        //Alert alert = driver.switchTo().alert();
       //String text= alert.getText();
       driver.switchTo().newWindow(WindowType.TAB);
       driver.navigate().to("https://www.google.com");
	   driver.quit();
		
		

	}

}
