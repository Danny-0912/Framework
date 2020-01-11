package Facebook_login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData 
{
	public WebDriver driver;
	@DataProvider(name="authentication")
	public Object[][] LoginData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] arrobj=Dataprovider.getData();
		
		return arrobj;
	}
	@BeforeMethod
	public void applcn()
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");	
	}
        @Test(dataProvider="authentication")
        public void login(String username,String password)
        {
        	driver.findElement(By.id("email")).sendKeys(username);
        	driver.findElement(By.id("pass")).sendKeys(password);
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        	String atitle = driver.getTitle();
        	Assert.assertEquals(atitle,"(10)Facebook");
}
        @AfterMethod
        public void closeapplc()
        {
        	driver.close();
        }
}



