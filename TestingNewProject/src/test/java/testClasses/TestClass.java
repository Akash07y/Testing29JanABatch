package testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass {
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite TestClass 1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test TestClass 1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass TestClass 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod TestClass 1");
	}
	
	@Test 
	public void testB()  {
		System.out.println("test B TestClass 1");
	}
	
	@Test 
	public void testA() {
		System.out.println("test A TestClass 1");
		Assert.fail();
		
	}
         System.out.println("Hello");

//	@AfterTest
//	public void afterTest() {
//		System.out.println("After Test TestClass 1");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Suite TestClass 1");
//	}

}
