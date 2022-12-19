package First_Mentoring_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Locators {
	static WebDriver driver;
	public static void main(String[] arg) { WebDriver driver;		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String actualtitle = "Amazon.com. Spend less. Smile more.";
		String expectedtitle = driver.getTitle();
		
		
		
	}

}
