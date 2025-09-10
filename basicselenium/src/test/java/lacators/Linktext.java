package lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Linktext {
	@Test
	public void linkTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement e=driver.findElement(By.linkText("Create a Page"));
		e.click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
