package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.className("nav__button-secondary")).click();
		driver.findElement(By.id("username")).sendKeys("peca.punker@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot password?")).click();


	}

}
