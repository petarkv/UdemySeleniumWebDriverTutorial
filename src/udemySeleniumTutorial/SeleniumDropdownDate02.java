package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumDropdownDate02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_RoundTrip']")).click();
				
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if (driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1")) {
			System.out.println("Radi");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

}
