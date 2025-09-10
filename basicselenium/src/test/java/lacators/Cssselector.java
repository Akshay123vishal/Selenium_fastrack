package lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cssselector {
@Test
	
	public void tiraSearchTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tirabeauty.com/");
		Thread.sleep(2000);
	
		WebElement search = driver.findElement(By.id("search"));
		Thread.sleep(2000);
		
		search.click();
		Thread.sleep(2000);
		
		search.sendKeys("perfumes"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Ramsons | Ramsons U R Lovely Eau De Parfum (30ml)']")).click();
		
		//search.clear();
		Thread.sleep(2000);
		
		driver.quit();
	}
	

	@Test
	
	public void googleTest() throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);

		driver.quit();
}

}
