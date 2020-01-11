





package Testscript;

import org.testng.annotations.Test;

import Generic_class.Generic_Test2;
import Pom_class.GitHub_login_page;
import Pom_class.Github_get_attribute;

public class GitHub_attrbute_Test extends Generic_Test2
{
	@Test
	public void Attribute() throws InterruptedException
	{
		GitHub_login_page gp=new GitHub_login_page(driver);
		gp.setusername("cutemelon6262@gmail.com");
		Thread.sleep(3000);
		gp.setpassword("anushakg94");
		Thread.sleep(3000);
		gp.clicklogin();
		
	Github_get_attribute ga=new Github_get_attribute(driver);
    ga.clickanote();
	Thread.sleep(3000);
	String res = ga.Stringattri();
	System.out.println(res);
	Thread.sleep(3000);
	String res2 = ga.StringText();
	System.out.println(res2);
}
	

}
