package locators_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {


			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//driver.navigate().to("http:www.google.com");
				
				driver.get("http:www.facebook.com");
				
				driver.findElement(By.name("email"))
				
				
				
				//driver.close();
				

	}

}
