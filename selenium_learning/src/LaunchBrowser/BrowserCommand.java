package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http;www.facebook.com");
		
		String pageTitle =driver.getTitle();
		
		System.out.println("Title of the page is ;"+ pageTitle);
		
		String current_url =driver.getCurrentUrl();
		
		System.out.println("current Testing url of the page is ;"+current_url);
		
		String pageSource =driver.getPageSource();
		
		//System.put.prinln(pageSource);
		
		//driver.close();
		
		driver.quit();
		
	
		
		}

}
