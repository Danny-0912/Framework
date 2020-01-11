package Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic_class.Generic_Excel;
import Generic_class.Generic_Test2;
import Pom_class.GitHub_login_page;
import Pom_class.Github_home_links;

public class Github_links_Test extends  Generic_Test2
{
	@Test
	public void countlinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
	String un = Generic_Excel.getData("sheet1", 1, 0);
	String pwd = Generic_Excel.getData("sheet1", 1, 1);
	GitHub_login_page gp=new GitHub_login_page(driver);
	gp.setusername(un);
	Thread.sleep(3000);
	gp.setpassword(pwd);
	Thread.sleep(3000);
	gp.clicklogin();
	Thread.sleep(3000);
	
	Github_home_links gl=new Github_home_links(driver);
	gl.countlinks();
	
	
	}
	

}
