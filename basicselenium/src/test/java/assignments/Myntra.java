package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
	
	@Test
	public void mantraTest() throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more'"));
		Thread.sleep(3000);
		search.sendKeys("watches"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		Thread.sleep(3000);
		
		
		
		
		
}

}
