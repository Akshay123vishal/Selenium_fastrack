package testNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.BaseTest;

public class LoginToapplicationUsernamePasswordTest extends BaseTest  {
	@Test
	public void logintoapplicationunameTest() {
		driver.findElement(By.xpath("Leave")).click();
	}

}
