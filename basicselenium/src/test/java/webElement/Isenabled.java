package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Isenabled {
	@Test
	public void isEnabledTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
	Boolean search =driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).isEnabled();
	
	System.out.println(search);
	Thread.sleep(3000);
		
	}
	
	@Test
	public void displayedTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	boolean loginbtn= driver.findElement(By.xpath("//button[text()=' Login ']")).isDisplayed();
	System.out.println(loginbtn);
	Thread.sleep(3000);
		
	}
	
	@Test
	public void enableTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		boolean btn = driver.findElement(By.id("confirm-button")).isEnabled();
		System.out.println(btn);
		
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void submitTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).submit();
		Thread.sleep(3000);
		
	}
	@Test
	public void submit1Test() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).submit();
		Thread.sleep(3000);
	}
	

}
