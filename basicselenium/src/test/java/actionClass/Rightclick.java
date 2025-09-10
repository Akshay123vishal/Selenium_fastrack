package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Rightclick {
	@Test
	public void rightClickTest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		WebElement pom=driver.findElement(By.partialLinkText("Page Object Model"));
		Actions a= new Actions(driver);
		a.contextClick(pom);
		a.perform();
	
	}

	
	public class dragdrop {
		@Test
		public void dragdropTest() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://letcode.in/droppable/");
			Thread.sleep(3000);
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement destination=driver.findElement(By.id("droppable"));
			Actions a= new Actions(driver);
			a.dragAndDrop(source, destination).perform();
			
		}
		
	}
	
	
	public class dragdrop1 {
		@Test
		public void dragdropTest() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://letcode.in/droppable/");
			Thread.sleep(3000);
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement destination=driver.findElement(By.id("droppable"));
			Actions a = new Actions(driver);
			a.clickAndHold(destination).moveToElement(source).release(source).perform();
			
		}
	}
	
	public class movetoElement {
		@Test
		public void Test() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			Thread.sleep(3000);
			WebElement stu=driver.findElement(By.xpath("//a[text()='Studio']"));
			Actions a = new Actions(driver);
			a.moveToElement(stu).perform();
			
			
		}
	}
	
	
	public class movetoElement1 {
		@Test
		public void Test() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			Thread.sleep(3000);
			WebElement hm=driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
			Actions a = new Actions(driver);
			a.moveToElement(hm, 80, 0).perform();
			
		}
	}
	
	public class movebyoffset {
		@Test
		public void Test() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://letcode.in/droppable/");
			Thread.sleep(3000);
			Actions a = new Actions(driver);
			a.moveByOffset(0, 300).contextClick().build().perform();
			
			
		}
	}
	
	public class doubleclick {
		@Test
		public void Test() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Thread.sleep(3000);
			WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			Actions a = new Actions(driver);
			a.doubleClick(button).perform();
		}
	}
}
