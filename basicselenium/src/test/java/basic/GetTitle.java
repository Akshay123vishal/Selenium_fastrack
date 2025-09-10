package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitle {
	@Test
	public void loginPageTest() throws InterruptedException {
	ChromeDriver d= new ChromeDriver();
	d.get("https://demoapps.qspiders.com/ui?scenario=1");
	System.out.println(d.getTitle());
	
	Thread.sleep(3000);
	d.quit();
	
	}

}
