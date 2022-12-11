package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoAuto {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Software\\BrowserDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Software\\BrowserDrivers\\geckodriver.exe");
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		
		
		

	}

}
