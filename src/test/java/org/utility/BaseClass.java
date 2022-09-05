package org.utility;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver browserlaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
		
	}
	public static void browserlaunch1(String browsername) {
		switch (browsername) {
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}

	}
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void implicitWait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}
	public static void staticwait(long secs) throws InterruptedException {
		Thread.sleep(secs);

	}
	public static void refreshpage() {
		driver.navigate().refresh();

	}
	public static void nextpage() {
		driver.navigate().forward();

	}
	public static void previouspage() {
		driver.navigate().back();

	}
	public static void newtab() {
		driver.switchTo().newWindow(WindowType.TAB);

	}
	public static void newwindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);

	}
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void btnClick(WebElement e) {
		e.click();

	}
	public static void quit() {
		driver.quit();

	}
	public static void clear(WebElement e) {
		e.clear();

	}
	public static String currentUrl() {
		String Url = driver.getCurrentUrl();
		return Url;

	}
	public static String title() {
		String title = driver.getTitle();
		return title;

	}
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
        a.moveToElement(target).perform();
	}
	public static void SelectByIndex(WebElement e,int index) {
		Select s=new Select(e);
        s.selectByIndex(index);
	}
	public static void SelectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.selectByValue(value);
	}
	public static void SelectByVisisbleText(WebElement e,String Value) {
		Select s=new Select(e);
s.selectByVisibleText(Value);
	}
	public static boolean isMultiple(WebElement e) {
		Select s=new Select(e);
        boolean multiple = s.isMultiple();
        return multiple;

	}
	
	public static boolean isEnable(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;

	}
	public static String getoption(WebElement e, int index) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		WebElement ops = options.get(index);
		String text = ops.getText();
		System.out.println(text);
		return text;
	}
	public static void deSelectByIndex(WebElement e,int index) {
		Select s=new Select(e);
        s.deselectByIndex(index);
	}
	public static void deSelectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	public static void deSelectByVisisbleText(WebElement e,String value) {
		Select s=new Select(e);
        s.deselectByVisibleText(value);
	
	}
public static void deselectall(WebElement e) {
	Select s=new Select(e);
    s.deselectAll();
    }

public static void scrollDown(WebElement down) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", down);

}
public static void scrollUp(WebElement up) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", up);

}

	public static void takeAllScreenshot() {
		long time = System.currentTimeMillis();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);

	}
	
	
	
	
	
}
