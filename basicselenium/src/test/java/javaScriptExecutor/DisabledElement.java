package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisabledElement {
	@Test
	public void disabledTest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html");
		 driver.findElement(By.linkText("jdk-24.0.2_doc-all.zip")).click();
		WebElement btn = driver.findElement(By.linkText("Download jdk-24.0.2_doc-all.zip"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",btn);
	}

}
