
package webElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrrenshot {
	@Test
	public void screenshotTest() throws InterruptedException, IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//step1:Downcast
	TakesScreenshot ts= (TakesScreenshot) driver;
	//step2:getscreenshotAs & store screenshot in file form
	File temp = ts.getScreenshotAs(OutputType.FILE);
	//create permenant location
	File destinationfile = new File("./image/pic.png");
	//created a folder and moved screenshot from temp location to permanent location
	FileUtils.copyFile(temp, destinationfile);
	Thread.sleep(3000);
	
	}
	@Test
	public void ssTest() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./image/pic1.png");
		FileUtils.copyFile(temp, destinationfile);
		Thread.sleep(2000);
		
	}
	@Test
	public void amazonTest() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("./image/pic3.png");
		FileUtils.copyFile(temp, destinationfile);
		Thread.sleep(3000);
		
		
	}
	@Test
	public void amazonweb() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ts1=driver.findElement(By.id("nav-logo-sprites"));
		
		File temp = ts1.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File("./image/pic4.png");
		FileUtils.copyFile(temp, destinationfile);
		Thread.sleep(2000);
		
	}
}
