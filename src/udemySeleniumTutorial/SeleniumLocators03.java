package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("#email")).sendKeys("peca.punker@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456789");
		driver.findElement(By.cssSelector("#loginbutton")).click();		
		System.out.println(driver.findElement(By.linkText("Find your account and log in.")).getText());
		
	}

}
