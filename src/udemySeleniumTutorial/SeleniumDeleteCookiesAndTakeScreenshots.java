package udemySeleniumTutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDeleteCookiesAndTakeScreenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
		//login page- verify login url
		
		driver.get("https://www.google.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Petar\\Selenium\\screenshot.png"));

	}

}
