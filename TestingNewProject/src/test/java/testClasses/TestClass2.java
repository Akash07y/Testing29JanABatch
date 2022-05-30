package testClasses;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite TestClass 2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test TestClass 2");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass TestClass 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod TestClass 2");
	}
	
	@Test 
	public void testC()  {
		System.out.println("test C TestClass 2");
		Assert.fail();
		
	}
	
	@Test 
	public void testD() {
		System.out.println("test D TestClass 2");
	}

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod TestClass 2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass TestClass 2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test TestClass2");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite TestClass2");
	}
}
