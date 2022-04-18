package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDropdownUpdate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://beta.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("div.r-19h5ruw:nth-child(5) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).getText());
		
		driver.findElement(By.cssSelector("div.r-19h5ruw:nth-child(5) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).click();
		Thread.sleep(2000);
		
//		int i=1;
//		while (i<4) {
//			driver.findElement(By.cssSelector("div.r-1x0uki6:nth-child(1) > div:nth-child(2) > "
//					+ "div:nth-child(3)")).click();
//			i++;
//		}
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.cssSelector("div.r-1x0uki6:nth-child(1) > div:nth-child(2) > "
					+ "div:nth-child(3)")).click();
		}
		
		driver.findElement(By.cssSelector(".r-obd0qt > div:nth-child(1)")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div.r-19h5ruw:nth-child(5) > div:nth-child(1) > "
				+ "div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).getText());
	}

}
