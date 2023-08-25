package test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	
	
	@Test(timeOut=4000)
	public void MobilehomeLoan()
	{
		System.out.println("Mobile home Loan");
	}
	
	
	@Test(groups={"Smoke"})
	@Parameters({"URL"})
	public void WebhomeLoan(String url)
	{
		System.out.println("Web home Loan");
		System.out.println(url);
	}
	
	@Test(dependsOnMethods={"WebhomeLoan"})
	public void APIhomeLoan()
	{
		System.out.println("API home Loan");
	}
	
	@Test(enabled=false)
	public void WebSignInHome()
	{
		System.out.println("Web SignIn Home");
	}
	
	@BeforeTest
	public void prerequisites()
	{
		System.out.println("EXECUTING before other tests of Personal Loan (@BeforeTest)");
	}

}
