package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetpageSource {
	@Test
	public void getpageTest() {
	WebDriver d= new ChromeDriver();
	d.get("https://www.facebook.com");
	
	String source= d.getPageSource();
	System.out.println(source);
}
	
	

}
