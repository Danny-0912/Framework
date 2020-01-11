package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_get_attribute {
	
	@FindBy(xpath="//span[.='autosia']")
	private WebElement anote;
	
	@FindBy(id="empty-setup-clone-url")
	private WebElement attribhttp;
	
	@FindBy(xpath="//pre[@id='empty-setup-new-repo-echo']")
	private WebElement attr;
	
	public Github_get_attribute(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void clickanote()
	{
		anote.click();
	}
	
	public String  Stringattri()
	{
		String val = attribhttp.getAttribute("value");
		return val;
		
		
		
	}
	public String StringText()
	{
		String text = attr.getText();
		return text;
	}

}
