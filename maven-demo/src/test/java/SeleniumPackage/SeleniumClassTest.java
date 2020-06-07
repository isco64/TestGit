package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClassTest {
	
	@Test
	public void SeleniumTestFunction() 
	{
		
		System.out.println("Andate a la xuxa");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.cl");
	}

}
