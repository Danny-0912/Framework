package Pom_class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_home_links {
	@FindBy(xpath="//a")
	private List<WebElement> links;
	
	public  Github_home_links(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void countlinks()
	{
		int count = links.size();	
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			
			WebElement we = links.get(i);
			String text = we.getText();
			System.out.println(text);
			
		}
	}

}
