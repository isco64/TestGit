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
		System.out.println("Ejecutando Test: ADD_PROD-01");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isco\\Desktop\\Esudios\\Quinto Semestre\\Tecnicas de Calidad\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
        String baseUrl = "http://localhost:8080/CarritoComprasWeb/";
        //String baseUrl = "http://www.duoc.cl/inicio";
        
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        //Ingresar Usuario y Password
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        WebElement navbarDropdown = driver.findElement(By.id("navbarDropdown"));
//        navbarDropdown.click();
//
//        WebElement txtuser = driver.findElement(By.name("txtuser"));
//        txtuser.sendKeys("admin");
//
//        WebElement txtpass = driver.findElement(By.name("txtpass"));
//        txtpass.sendKeys("123456");
//        
//        WebElement accionBtn = driver.findElement(By.name("accion"));
//        accionBtn.click();
        
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        //Ingresar Usuario y Password Erroneo
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        WebElement navbarDropdown = driver.findElement(By.id("navbarDropdown"));
//        navbarDropdown.click();
//
//        WebElement txtuser = driver.findElement(By.name("txtuser"));
//        txtuser.sendKeys("bot");
//
//        WebElement txtpass = driver.findElement(By.name("txtpass"));
//        txtpass.sendKeys("87r4hieh");
//        
//        WebElement accionBtn = driver.findElement(By.name("accion"));
//        accionBtn.click();
        
        
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        //Hacer CLick en link de carrito de compras
//        /*-------------------------------------------------------------------------------------------------------------------*/
//
//        driver.findElement(By.linkText("Carrito de Compras")).click();
//        
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        //Hacer CLick en link de Home
//        /*-------------------------------------------------------------------------------------------------------------------*/
//
//        driver.findElement(By.linkText("Home")).click();
        
//        /*-------------------------------------------------------------------------------------------------------------------*/
//        //Hacer CLick en link de Ofertas del día
//        /*-------------------------------------------------------------------------------------------------------------------*/
//
//        driver.findElement(By.linkText("Ofertas del día")).click();
        
//      /*-------------------------------------------------------------------------------------------------------------------*/
//      //Hacer Click en Realizar Compra sin productos
//      /*-------------------------------------------------------------------------------------------------------------------*/
//
//      driver.findElement(By.linkText("Carrito de Compras")).click();
//      driver.findElement(By.linkText("Realizar compra")).click();
      
      /*-------------------------------------------------------------------------------------------------------------------*/
      //Hacer Click en Realizar Compra sin productos
      /*-------------------------------------------------------------------------------------------------------------------*/

      driver.findElement(By.linkText("Search")).click();  
      
	}

}
