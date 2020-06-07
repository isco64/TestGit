package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClassTest {
	
	@Test
	public void SeleniumTestFunction() 
	{
		System.out.println("Andate a la xuxa");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isco\\Desktop\\Esudios\\Quinto Semestre\\Tecnicas de Calidad\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.cl");
	}

}
