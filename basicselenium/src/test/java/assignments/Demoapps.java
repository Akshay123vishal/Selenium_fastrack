package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoapps {


	@Test
	public void demoappsTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Akshay");
		Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys("akshayjagtap5539@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Vishal@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
