package Generic_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_action {
	
	public void mouseover(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement b1,WebElement b3)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(b1, b3).perform();
	}

	public void doubleclick(WebDriver driver,WebElement block)
	{
		Actions act=new Actions(driver);
		act.doubleClick(block).perform();
	}
	
	public void Rightclick(WebDriver driver,WebElement link)
	{
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
}
}



