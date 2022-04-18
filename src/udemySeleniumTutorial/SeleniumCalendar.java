package udemySeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"))
				.getText().contains("December")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		int dateCount = driver.findElements(By.className("day")).size();
		
		for (int i = 0; i < dateCount; i++) {
			
			String dateText = driver.findElements(By.className("day")).get(i).getText();
			if (dateText.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
