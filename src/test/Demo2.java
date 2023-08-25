package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("EXECUTING after all tests (@AfterSuite)");
	}
	
	@Test(dataProvider="getdata")
	public void dataprovider(String usrname, String pwd)
	{
		System.out.println("List of usernames and passwords");
		System.out.println(usrname);
		System.out.println(pwd);
	}
	
	@Test(groups={"Smoke"})
	public void testdemo()
	{
		System.out.println("Something");
	}
	@Test
	@Parameters({"URL"})
	public void testdemo1(String urlname)
	{
		System.out.println("Nothing");
		System.out.println(urlname);
	}
	
	@AfterTest
	public void postrequisite()
	{
		System.out.println("EXECUTING after other tests of Personal Loan (@AfterTest)");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("EXECUTING every time before each test of Personal Loan (@BeforeMethod)");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("EXECUTING every time after each test of Personal Loan (@AfterMethod)");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj = new Object[3][2];   
		//rows signifies no. of times we need to run and Col is no data present in each
		
		obj[0][0] = "FirstUser";
		obj[0][1] = "firstuserpassword";
		
		obj[1][0] = "SecondUser";
		obj[1][1] = "seconduserpassword";
		
		obj[2][0] = "ThirdUser";
		obj[2][1] = "thirduserpassword";
		
		return obj;
	}
	

}
