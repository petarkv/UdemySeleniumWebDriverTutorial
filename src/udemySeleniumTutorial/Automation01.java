package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Automation01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.id("ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_HealthCareProfessional")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_HealthCareProfessional")).click();
		Assert.assertTrue(driver.findElement(By.id("ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_HealthCareProfessional")).isSelected());
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_DropDownListPassengerType_ADT")).click();
		Thread.sleep(2000);
		Select a = new Select(driver.findElement(By.cssSelector("#ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_DropDownListPassengerType_ADT")));
		a.selectByValue("4");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "4 Adult");
		
	}

}
