package Generic_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test2 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://github.com/login");
	}
	@AfterMethod
	public void closeappln(ITestResult res) throws IOException
	{
		Generic_screenshot gs=new Generic_screenshot();
		gs.getphoto(driver);
		driver.quit();
	}

}
