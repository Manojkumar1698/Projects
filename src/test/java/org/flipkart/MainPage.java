package org.flipkart;

import java.util.Set;

import org.openqa.selenium.remote.server.handler.SendKeys;
import org.utility.BaseClass;

public class MainPage extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		browserlaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicitWait(10);
Loginpage l=new Loginpage();
sendkeys(l.getTxtuser(), "9551116520");
sendkeys(l.getPasswd(), "manokaran1");		
btnClick(l.getLogin());

Thread.sleep(3000);

sendkeys(l.getSearchBox(), "Redmi");
btnClick(l.getClkbutton());


productPage p=new productPage();


String parent = driver.getWindowHandle();

Set<String> child = driver.getWindowHandles();
for(String eachid:child) {
	if(!parent.equals(eachid)) {
		driver.switchTo().window(eachid);
	}
}

sendkeys(p.getPincode(), "600059");
btnClick(p.getCheck());
btnClick(p.getBtnBuy());



	}
	
	

}
