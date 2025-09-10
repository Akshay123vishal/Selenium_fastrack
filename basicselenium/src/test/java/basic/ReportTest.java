package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportTest {
	@Test
	public void reportTest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://latecode.in/test");
		
		ExtentSparkReporter esp= new ExtentSparkReporter("./Reports/latecode1.png");
		esp.config().setReportName("pune");
		esp.config().setTheme(Theme.DARK);
		esp.config().setDocumentTitle("Hello");
		
		ExtentReports rep=new ExtentReports();
		rep.attachReporter(esp);
		rep.flush();
		
		
			}
	
	@Test
	public void reportTest1() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://latecode.in/test");
		
		ExtentSparkReporter esp= new ExtentSparkReporter("./Reports/latecode4.png");
		esp.config().setReportName("pune");
		esp.config().setTheme(Theme.DARK);
		esp.config().setDocumentTitle("Hello");
		
		ExtentReports rep=new ExtentReports();
		rep.attachReporter(esp);
		rep.setSystemInfo("Browser", "Chrome");
		rep.setSystemInfo("os", "windows");
		rep.setSystemInfo("author", "pune");
		rep.flush();
	}
	@Test
	public void report1Test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		ExtentSparkReporter esp= new ExtentSparkReporter("./Reports/latecode2.png");
		esp.config().setReportName("kolhapur");
		esp.config().setTheme(Theme.DARK);
		esp.config().setDocumentTitle("Star");
		
		ExtentReports rep=new ExtentReports();
		rep.attachReporter(esp);
		rep.setSystemInfo("browser", "chrome");
		rep.setSystemInfo("os", "windows");
		rep.setSystemInfo("author", "kolhapur");
		rep.flush();
		
		
		
			
		}
		
		
	}
		
		


