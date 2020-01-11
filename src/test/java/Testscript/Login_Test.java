package Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Generic_class.Generic_Excel;
import Generic_class.Generic_Test2;
import Pom_class.GitHub_login_page;
import Pom_class.Github_logout_page;

public class Login_Test extends Generic_Test2  
{
	@Test
	public void gitHub_login() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		
		Github_logout_page  gl=new Github_logout_page(driver);
		gl.clicklogout();
		Thread.sleep(3000);
		gl.clicksignout();
		
		
	}

}
