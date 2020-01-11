package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_login_page {
	//declaration
	@FindBy(id="login_field")
	private WebElement untx;
	
	@FindBy(id="password")
	private WebElement pwdtxb;
	
	@FindBy(name="commit")
	private WebElement lognbtn;
	
	//initialization
	public GitHub_login_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void setusername(String un)
	{
		untx.sendKeys(un);	
	}
	public void setpassword(String pwd)
	{
		pwdtxb.sendKeys(pwd);
	}
	public void clicklogin()
	{
		lognbtn.click();
	}
}