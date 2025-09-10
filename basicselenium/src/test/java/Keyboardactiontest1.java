import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboardactiontest1 {
	@Test
	public void keyboardaction() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
		WebElement wom=driver.findElement(By.xpath("//span[text()='WOMEN']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		a.click(wom).perform();
		a.keyUp(Keys.CONTROL).perform();
		
	}



	@Test
	public void scroolTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 900).perform();
		Thread.sleep(3000);
		a.scrollByAmount(0, -500).perform();
		
		
	}
	@Test
	public void scroolTest1() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		Thread.sleep(3000);
		WebElement f=driver.findElement(By.xpath("//a[text()=' Find Elements ']"));
		
		Actions a = new Actions(driver);
		a.scrollToElement(f).perform();
		Thread.sleep(2000);
}
	
	
	@Test
	public void keyboardActionTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
		Thread.sleep(2000);
		WebElement women=driver.findElement(By.xpath("//span[text()='WOMEN']"));
		Actions a= new Actions(driver);
		a.keyDown(Keys.CONTROL).perform();
		a.click(women).perform();
		
	}
	@Test
	public void scrollbyTest() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		Thread.sleep(2000);
		Actions a= new Actions(driver);
		a.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		
		
		
		
	}
}






