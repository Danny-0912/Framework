package Generic_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_select {
	
	public void selectindex(WebElement ele,int i)
	{
	Select s=new Select(ele);
	s.selectByIndex(i);
}
	
	public void selectvalue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
	public void selectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void deselectindex(WebElement ele,int i)
	{
		Select s=new Select(ele);
		s.deselectByIndex(i);
	}
	
	public void deselectvalue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	
	public void deselectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	public void deselectall(WebElement ele)
	{
		Select s=new Select(ele);
		s.deselectAll();
	}
	
}


