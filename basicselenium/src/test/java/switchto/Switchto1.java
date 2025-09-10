package switchto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switchto1 {
	@Test
	public void switchtoTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement tf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		tf.sendKeys("watches");
		tf.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("img[title='Carlton London Women Dial & Stainless Steel Bracelet Style Straps Analogue Watch CLSSCDGRN']")).click();
		Set<String> win = driver.getWindowHandles();
		for(String id:win) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.cssSelector(""))
		
		
		
	}
	}


