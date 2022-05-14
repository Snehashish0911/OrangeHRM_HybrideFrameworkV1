package locators_in_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVsElements {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http;//www.facebook.com/");
	
    WebElement ele = driver.findElement(By.name("email"));
    
   List<WebElement> list =  driver.findElements(By.tagName("a"));
   
   System.out.println(list.size());
   
   
   for (WebElement elel : list) {
	   
	   System.out.println(ele.getText());
	   
	}

}
}