package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate {
	@Test
	public void navigateTest() throws Exception {
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.facebook.com");
	Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.navigate().to("https://www.facebook.com");
		d.navigate().back();
	}

}
