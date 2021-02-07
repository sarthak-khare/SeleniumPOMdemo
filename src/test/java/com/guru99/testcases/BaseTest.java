package com.guru99.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.guru99.base.BasePage;

// Comment to check git-pull

public class BaseTest {

	@BeforeSuite
	public void setUp() {
		BasePage.setUp();
		System.out.println("Inside Before Suite");
	}
	


	@AfterSuite
	public void tearDown() {
		BasePage.tearDown();
		System.out.println("Inside After Suite");
	}
	
}
