package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.linkText("Sign in")).click();
		
//		//tagName[@attribute='value'] - xpath
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("edureka@yahoo.com");		
//		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
//		tagName[attribute='value'] - CSS
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("edureka@yahoo.com");
		driver.findElement(By.cssSelector("input[value='Next']")).click();

	}

}
