package lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdTest {
	@Test
	public void idTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb"));
		
		
	}



@Test
public void googleTest() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement searchtf =driver.findElement(By.id("APjFqb"));
	searchtf.click();
	searchtf.sendKeys("Pune");
	Thread.sleep(3000);
	searchtf.clear();
}
	


@Test
public void tiraTest() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tirabeauty.com/");
	WebElement searchtf=driver.findElement(By.id("search"));
	searchtf.click();
	searchtf.sendKeys("perfume");
	Thread.sleep(3000);
	searchtf.clear();
	
	
}


@Test
public void xpathTest() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tirabeauty.com/");
	driver.findElement(By.xpath("//a[text()='Men']")).click();
	Thread.sleep(3000);
	
}

	

@Test
public void nameTest1() throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.name("email")).sendKeys("akshay@gmail.com");

Thread.sleep(3000);

}

@Test
public void linktextTest() throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.tirabeauty.com");
WebElement link=driver.findElement(By.linkText( "Help Centre"));
link.click();
Thread.sleep(3000);


}


@Test
public void partiallinktextTest() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tirabeauty.com");
	WebElement contact=driver.findElement(By.partialLinkText("Minis"));
	contact.click();
	Thread.sleep(3000);
	
	
}
	
}

