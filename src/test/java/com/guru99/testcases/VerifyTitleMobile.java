package com.guru99.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.guru99.base.BasePage;
import com.guru99.pages.MobilePage;

public class VerifyTitleMobile extends ClickOnMobile {

	@Test(priority = 2, dependsOnMethods = "clickOnMobile")
	public void verifyMobileTitle() {
		System.out.println("Inside test2");
		System.out.println(MobilePage.getTitle());
		Assert.assertEquals(MobilePage.getTitle(), BasePage.readORfile("mob_title"));
		
		
	}
}
