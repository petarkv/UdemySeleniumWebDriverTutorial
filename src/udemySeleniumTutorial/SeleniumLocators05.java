package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.cssSelector("a[class*='secondary']")).click();
		driver.findElement(By.cssSelector("input[name='session_key']")).sendKeys("PecaPunker");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[contains(@class,'btn__primary')]")).click();

	}

}
