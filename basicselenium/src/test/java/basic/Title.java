package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Title {
	@Test
	public void titleTest() throws InterruptedException {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.myntra.com/");
		//Driver.manage().window().maximize();
		//Driver.manage().window().minimize();
		//Driver.manage().window().fullscreen();
		Driver.manage().window().getSize();
		
	
		Thread.sleep(3000);
		Driver.close();
		
	}

}
