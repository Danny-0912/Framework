

package Generic_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Browser_action {
	
	public void maximize_action(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize() throws AWTException
	{
		Robot r;
		try {
			r=new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_N);
		
		}catch (AWTException e) {
			// TODO: handle exception
		}
		
		
	}


public void close_action()
{
	Robot r;
	try {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);
	
	}catch (AWTException e) {
		// TODO: handle exception
	}
	
	
}

public void  resize_action(WebDriver driver,int w ,int h)
{
    Dimension d =new Dimension(w,h);
	driver.manage().window().setSize(d);
}

public void Drag_action(WebDriver driver,int x,int y)
{
	Point p=new Point(x,y);
	driver.manage().window().setPosition(p);
}

public void newtab()
{
	Robot r;
	try {
		r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
}catch (AWTException e) {
	
}
}
public void backward_action(WebDriver driver)
{
	driver.navigate().back();
}

public void forward_action(WebDriver driver)
{
	driver.navigate().forward();
}

public void refresh_action(WebDriver driver)
{
	driver.navigate().refresh();
}

public void quit_action(WebDriver driver)
{
	driver.quit();
}
}




