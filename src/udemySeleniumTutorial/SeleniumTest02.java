package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumTest02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(2000);

		driver.findElement(
				By.id("ControlGroupSearchView_Availability" + "SearchInputSearchView_HealthCareProfessional")).click();

		// From
		driver.findElement(By.cssSelector(
				"input[id='ControlGroupSearchView_Availability" + "SearchInputSearchVieworiginStation1_CTXT']"))
				.click();
		driver.findElement(By.cssSelector("a[value='BKK']")).click();
		Thread.sleep(2000);

		// To
		driver.findElement(By.cssSelector("div[id='glsControlGroupSearchView_Availability"
				+ "SearchInputSearchViewdestinationStation1_CTNR'] a[value='KBL']")).click();
		Thread.sleep(2000);

		// Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// Passengers
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(
				"#ControlGroupSearchView_Availability" + "SearchInputSearchView_DropDownListPassengerType_ADT"))
				.click();
		Thread.sleep(2000);
		Select a = new Select(driver.findElement(By.cssSelector(
				"#ControlGroupSearchView_Availability" + "SearchInputSearchView_DropDownListPassengerType_ADT")));
		a.selectByValue("4");
		Select k = new Select(driver.findElement(By.cssSelector(
				"#ControlGroupSearchView_Availability" + "SearchInputSearchView_DropDownListPassengerType_CHD")));
		k.selectByValue("2");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "4 Adult, 2 Child");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		// Return Date is disabled
		System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		if (driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("0.5")) {
			System.out.println("Radi");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Currency
		driver.findElement(
				By.cssSelector("#ControlGroupSearchView_Availability" + "SearchInputSearchView_DropDownListCurrency"))
				.click();
		Select c = new Select(driver.findElement(
				By.cssSelector("#ControlGroupSearchView_Availability" + "SearchInputSearchView_DropDownListCurrency")));
		c.selectByValue("EUR");

		// Search
		driver.findElement(By.cssSelector(".bookbtn")).click();
	}
}
