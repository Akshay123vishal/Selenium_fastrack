package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WatchTest {
	@Test
	public void waitTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("watches"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		Thread.sleep(2000);
		
		
	}

}
