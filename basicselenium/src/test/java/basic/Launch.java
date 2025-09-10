package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		ChromeDriver d =new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		// TODO Auto-generated method stub

	}

}
