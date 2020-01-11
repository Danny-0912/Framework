package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_home_page {
	//declaration
	@FindBy(xpath="//a[.='Start a project']")
	private WebElement startproject;
	
	@FindBy(id="repository_name")
	private WebElement Repos;
	
	@FindBy(xpath="//button[@class='btn btn-primary first-in-line']")
	private WebElement creatrepo;
	
	//Initialization
	public GitHub_home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void clickstart()
	{
		startproject.click();
	}
	
	public void setreposname(String name)
	{
		Repos.sendKeys(name);	
	}
	
	public void clickcreate()
	{
		creatrepo.click();	
	}
	
	
	

}
