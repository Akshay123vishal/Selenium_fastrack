package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTest {
	
	@Test
	public void launchTest() {
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");

}
}
