package com.guru99.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.guru99.pages.HomePage;

public class ClickOnMobile extends BaseTest{

	public static HomePage hp;
	@Test(priority = 1)
	public void clickOnMobile() {
		System.out.println("Inside Test 1");
		hp = new HomePage();
		hp.goToMobile();
	}
	
}
