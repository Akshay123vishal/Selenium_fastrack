package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest {
	@Test
	public void createAccountTest() {
		System.out.println("create account");
		Assert.assertEquals("pune", "hadapsar");
		
	}
	@Test(dependsOnMethods="createAccountTest")
	public void deleteaccountTest() {
		System.out.println("delete account");
	}

}
