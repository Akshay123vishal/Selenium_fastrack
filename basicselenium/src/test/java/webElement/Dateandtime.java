package webElement;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dateandtime {
	@Test
	public void dateTest() throws IOException, InterruptedException {
		Date d= new Date();
		String timedate=d.toString().replace(':', '-');
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//step1:Downcast
		TakesScreenshot ts= (TakesScreenshot) driver;
		//step2:getscreenshotAs & store screenshot in file form
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//create permenant location
		File destinationfile = new File("./image/pic1"+timedate+".png");
		//created a folder and moved screenshot from temp location to permanent location
		FileUtils.copyFile(temp, destinationfile);
		Thread.sleep(3000);
	}

}
