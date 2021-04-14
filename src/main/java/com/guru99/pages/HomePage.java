package com.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.base.BasePage;

public class HomePage extends BasePage {

	public void goToMobile() {
		System.out.println("Inside goToMobile function");
		driver.findElement(By.xpath("//li[@class = 'level0 nav-1 first']/a")).click();
		System.out.println("Page Title from goToMobile method " + driver.getTitle());

		// return new MobilePage();
	}

	public void goToTV() {

	}

	public void goToAboutUs() {

	}

}
