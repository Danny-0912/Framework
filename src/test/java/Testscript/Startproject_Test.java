package Testscript;

import org.testng.annotations.Test;

import Generic_class.Generic_Test2;
import Pom_class.GitHub_home_page;
import Pom_class.GitHub_login_page;

public class Startproject_Test extends Generic_Test2
{
	@Test
	public void homepage() throws InterruptedException
	{
		GitHub_login_page gp=new GitHub_login_page(driver);
		gp.setusername("cutemelon6262@gmail.com");
		Thread.sleep(3000);
		gp.setpassword("anushakg94");
		Thread.sleep(3000);
		gp.clicklogin();
		Thread.sleep(5000);
		
		GitHub_home_page hp=new GitHub_home_page(driver);
		hp.clickstart();
		Thread.sleep(3000);
		hp.setreposname("spectrum");
		Thread.sleep(3000);
		hp.clickcreate();
	}

}
