package org.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.utility.BaseClass;

public class productPage extends BaseClass{
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement Redmi;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement pincode;
	
	@FindBy(xpath="(//span[@class='_2P_LDn']")
	private WebElement check;
	
	@FindBy(xpath="(//button[@type='button']")
	private WebElement btnBuy;

	public WebElement getRedmi() {
		return Redmi;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getBtnBuy() {
		return btnBuy;
	}
	
	
	
}
