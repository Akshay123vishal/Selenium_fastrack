package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoapps {
	@Test
	public void DemoappsTest() {

		WebDriver d= new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
	}
	@Test
	public void loginToAppTest() {
		
	}

}
