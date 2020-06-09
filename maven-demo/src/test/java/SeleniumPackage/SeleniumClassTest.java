package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClassTest {
	
	@Test
	public void SeleniumTestFunction() 
	{
		System.out.println("Cargabdi");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isco\\Desktop\\Esudios\\Quinto Semestre\\Tecnicas de Calidad\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
        //String baseUrl = "http://localhost:8080/CarritoComprasWeb/";
        String baseUrl = "http://www.duoc.cl/inicio";
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        // click en link
        //driver.findElement(By.linkText("Carrito de Compras")).click();
	}

}
