package com.guru99.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.guru99.base.BasePage;

// Comment to check git-pull

// Adding new comment to check git-pull again

public class BaseTest {

	@BeforeTest
	public void setUp() {
		BasePage.setUp();
		System.out.println("Inside Before Test");
	}

	@AfterTest
	public void tearDown() {
		BasePage.tearDown();
		System.out.println("Inside After Test");
	}

}
