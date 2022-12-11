package UI;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	public static String browser = "Firefox";
	public static WebDriver driver;
	//public static ChromeDriver driver2;


	public static void main(String[] args) {
		if(browser.contains("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		driver.get("https://chaldal.com/");//go to url		
		driver.manage().window().maximize();//maximize the window

//SEARCH FOR ITEM
		//driver.findElement(By.xpath("//input[@type='text'][@class='searchBox']")).sendKeys("mobil");//find search file then enter keyword		
		//driver.findElement(By.xpath("//input[@type='submit'][@class='search-button']")).click();//click on search btn
		driver.manage().window().minimize();//minimize the window
        driver.close();
		

	}

}
