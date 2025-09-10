package extentReportConcep;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Latecodetest {
	public ExtentReports rep;
	@BeforeSuite
	public void BS() {
		ExtentSparkReporter esp= new ExtentSparkReporter("./Reports/latecode4.png");
		esp.config().setReportName("pune");
		esp.config().setTheme(Theme.DARK);
		esp.config().setDocumentTitle("Hello");
		
	    rep=new ExtentReports();
		rep.attachReporter(esp);
		rep.setSystemInfo("Browser", "Chrome");
		rep.setSystemInfo("os", "windows");
		rep.setSystemInfo("author", "pune");
		
		
	}
	
	@Test
	public void homePageTest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://latecode.in/test");
		
		ExtentTest test = rep.createTest("homePageTest");
		test.log(Status.INFO, "home page is displayed");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String temp = ts.getScreenshotAs(OutputType.BASE64);
		if(driver.getTitle().contains("pune")) {
			test.log(Status.PASS, "title contains pune");
		}else {
			test.log(Status.FAIL, "title not contain pune");
			
			test.addScreenCaptureFromBase64String(temp, "image");
		}
		
	}
	
	@Test
	public void EditpageTest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://latecode.in/test");
		driver.findElement(By.xpath("//a[text()=' Edit ']")).click();
		
		ExtentTest test = rep.createTest("EditpageTest");
		test.log(Status.INFO, "Edit page is displayed");
		
		
	}
	@AfterSuite
	public void AS() {
		rep.flush();
		
	}

}
