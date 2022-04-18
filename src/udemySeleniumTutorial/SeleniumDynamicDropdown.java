package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://beta.spicejet.com/");
		// From
		driver.findElement(By.cssSelector("div.r-1g40b8q:nth-child(3) > div:nth-child(1) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.r-p1pxzi:nth-child(2) > div:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.r-1awozwy:nth-child(8) > div:nth-child(1) > div:nth-child(1) > "
				+ "div:nth-child(1)")).click();
		
		// To
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.r-p1pxzi:nth-child(2) > div:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.r-rnv2vh:nth-child(2) > div:nth-child(1) > div:nth-child(1) > "
				+ "div:nth-child(1)")).click();
	}

}
