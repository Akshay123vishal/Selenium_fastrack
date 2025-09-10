package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class latecode {
	@Test
	public void latecodeTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebDriverWait Wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement searchbar=driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		Wait.until(ExpectedConditions.elementToBeClickable(searchbar));
		searchbar.sendKeys("watches");
	
	}
	@Test
	public void latecodeTest1() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		WebElement edittext = driver.findElement(By.xpath("//a[text()=' Edit ']"));
		WebDriverWait Wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		Wait.until(ExpectedConditions.elementToBeClickable(edittext));
		edittext.click();
		driver.findElement(By.id("fullName")).sendKeys("akshay");
		
	
	
	}
	
	@Test
	public void latecodeTest3() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		WebElement edittext = driver.findElement(By.xpath("//a[text()=' Edit ']"));
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(10));
		WebDriverWait Wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		
	
		Wait.until(ExpectedConditions.elementToBeClickable(edittext));
		edittext.click();
		driver.findElement(By.id("fullName")).sendKeys("akshay");
	}	
	
	
}


