package lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getwindowhandle {
	@Test
	public void getwindowhandleTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		WebElement search=driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		search.sendKeys("watches");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		
		
	}

}
