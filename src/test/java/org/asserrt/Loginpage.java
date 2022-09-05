package org.asserrt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Loginpage extends BaseClass{
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement txtuser;
	
@FindBy(xpath="//input[@type='password']")
private WebElement passwd;

@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement login;

public WebElement getTxtuser() {
	return txtuser;
}

public WebElement getPasswd() {
	return passwd;
}

public WebElement getLogin() {
	return login;
	
}

@FindBy(xpath="//input[@type='text']")
private WebElement SearchBox;


@FindBy(xpath="//button[@class='L0Z3Pu']")
private WebElement clkbutton;

public WebElement getSearchBox() {
	return SearchBox;
}

public WebElement getClkbutton() {
	return clkbutton;
}

}


