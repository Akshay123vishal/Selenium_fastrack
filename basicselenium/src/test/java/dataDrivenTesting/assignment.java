package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment {
	@Test
	public void Test() throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("src\\main\\resources\\akshay2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell cell = r.getCell(1);
		String Firstname = cell.getStringCellValue();
		System.out.println(Firstname);
		
		Row r1 = sh.getRow(1);
		Cell cell1 = r.getCell(1);
		
		String Lastname = zz
		System.out.println(Lastname);
		
		String Email = cell.getStringCellValue();
		System.out.println(Email);
		
		String password = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(password);
		
		String Confirmpassword = wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		System.out.println(Confirmpassword);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.name("FirstName")).sendKeys(Firstname);
		driver.findElement(By.name("LastName")).sendKeys(Lastname);
		driver.findElement(By.name("Email")).sendKeys(Email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(Confirmpassword);
		
	}

}
