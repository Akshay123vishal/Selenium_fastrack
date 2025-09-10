package lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpathbytext {
	@Test
	public void xpathTextTest() throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.malaicha.com/login");
		WebElement no=driver.findElement(By.cssSelector("input[name='username']"));
		no.sendKeys("0992216553");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='pin']")).sendKeys("4162");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
