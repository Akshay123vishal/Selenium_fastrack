package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getattribute {
	@Test
	public void getAttributeTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com");
		String search=driver.findElement(By.cssSelector("input[placeholder='Search']")).getAttribute("placeholder");
		System.out.println(search);
		
		
		Thread.sleep(3000);
	}
	
	@Test
	public void getCSSvalueTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com");
		String search=driver.findElement(By.cssSelector("input[placeholder='Search']")).getCssValue("placeholder");
				
				System.out.println(search);
	}
	
@Test
public void sendKeysTest() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo7.vtexperts.com/vtigercrm7demo/index.php");
	WebElement button=driver.findElement(By.xpath("//button[text()='Sign in']"));
	//button.sendKeys(Keys.ENTER);
	WebElement button1=driver.findElement(By.id("username"));
			button1.sendKeys(Keys.CONTROL+"A");
			button1.sendKeys(Keys.DELETE);
		
	        Thread.sleep(3000);
	


}	

@Test
public void sedkeysTest() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo7.vtexperts.com/vtigercrm7demo/index.php");
	WebElement button=driver.findElement(By.xpath("//button[text()='Sign in']"));
	button.sendKeys(Keys.CONTROL+"A");
	
	
	
	driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"V");
	Thread.sleep(3000);
}

@Test
public void getTextTest() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	String element=driver.findElement(By.xpath("//p[text()='Forgot Your Password? ']")).getText();
	System.out.println(element);
	String link=driver.findElement(By.linkText("OrangeHRM, Inc")).getText();
	System.out.println(link);
	Thread.sleep(3000);
	String username=driver.findElement(By.name("username")).getText();
	System.out.println(username);
	Thread.sleep(3000);
	
	
}
	


}
