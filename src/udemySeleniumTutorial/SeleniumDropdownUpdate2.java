package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropdownUpdate2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_Availability" 
				+ "SearchInputSearchView_HealthCareProfessional")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_HealthCareProfessional")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_HealthCareProfessional")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_DropDownListPassengerType_ADT")).click();
		Thread.sleep(2000);
		Select a = new Select(driver.findElement(By.cssSelector("#ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_DropDownListPassengerType_ADT")));
		a.selectByValue("4");
		
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_DropDownListPassengerType_CHD")).click();
		Thread.sleep(2000);
		Select k = new Select(driver.findElement(By.cssSelector("#ControlGroupSearchView_Availability"
				+ "SearchInputSearchView_DropDownListPassengerType_CHD")));
		k.selectByValue("3");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
	}

}
