package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDropdownDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		
		// From
		driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_Availability"
				+ "SearchInputSearchVieworiginStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='BKK']")).click();
		Thread.sleep(2000);
		
		// To
		driver.findElement(By.cssSelector("div[id='glsControlGroupSearchView_Availability"
				+ "SearchInputSearchViewdestinationStation1_CTNR'] a[value='KBL']")).click();
		Thread.sleep(2000);
		
		// Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	}

}
