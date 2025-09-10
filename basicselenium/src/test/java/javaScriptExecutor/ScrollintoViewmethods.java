package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollintoViewmethods {
	@Test
	public void scrollIntoViewTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		WebElement Indian_flag = driver.findElement(By.xpath("//span[text()='India']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView(true)",Indian_flag);
		Thread.sleep(2000);
	}

}
