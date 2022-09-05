package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass{
	public static void main(String[] args) {
		
		browserlaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		maximize();
		implicitWait(10);
//		String currentUrl = currentUrl();
//		System.out.println(currentUrl);
//		String title = title();
//		System.out.println(title);
		
		WebElement btnclk = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnClick(btnclk);
		WebElement dropdown = driver.findElement(By.id("day"));
		
		
	}
}
