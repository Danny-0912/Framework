package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_logout_page {
	
	@FindBy(xpath="(//span[@class='dropdown-caret'])[2]")
	private WebElement logout;
	
	@FindBy(xpath="//button[@class='dropdown-item dropdown-signout']")
	private WebElement signout;
	
	public  Github_logout_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicklogout()
	{
		 logout.click();
	}
	
	public void clicksignout()
	{
		signout.click();
	}
	
	}

