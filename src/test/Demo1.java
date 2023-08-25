package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(groups={"Smoke"})
	@Parameters({"URL","Username"})
	public void Demo(String url,String usrname){
		System.out.println("Starting out TestNg");
		System.out.println(url);
		System.out.println(usrname);

	}
	
	@Test(groups={"Smoke"})
	public void demo1()
	{
		System.out.println("Failing out TestNG");
		Assert.assertTrue(false);
	}
	@BeforeTest
	public void prerequisitess()
	{
		System.out.println("EXECUTING before other tests of Car Loan (@BeforeTest)");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("EXECUTING before startingOut TestNg (@BeforeClass)");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("EXECUTING after startingOut TestNg (@AfterClass)");
	}
	@Test
	@Parameters({"URL"})
	public void parameterdemo(String carurl)
	{
		System.out.println("Parameters Demo");
		System.out.println(carurl);
	}
	
	

}
