package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void MobileCarLoan()
	{
		System.out.println("Mobile Car Loan");
	}
	
	
	@Test
	@Parameters({"URL"})
	public void WebCarLoan(String url)
	{
		System.out.println("Web Car Loan");
		System.out.println(url);
	}
	
	@Test
	public void APICarLoan()
	{
		System.out.println("API Car Loan");
	}
	
	@Test
	public void WebSignInCar()
	{
		System.out.println("Web SignIn Car");
	}
	
	@Test(groups={"Smoke"})
	public void WebSignOutHCar()
	{
		System.out.println("Web SignOut Car");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("EXECUTING before all tests (@BeforeSuite)");
	}
	
	@AfterTest
	public void postrequisites()
	{
		System.out.println("EXECUTING after other tests of Car Loan (@AfterTest)");
	}
	

}
