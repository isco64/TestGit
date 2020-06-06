package holi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test instance = new test();
		instance.SendMessage();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isco\\Desktop\\Esudios\\Quinto Semestre\\Tecnicas de Calidad\\Selenium\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}

}
