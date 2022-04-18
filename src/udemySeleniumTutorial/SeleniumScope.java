package udemySeleniumTutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumScope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Number of Links on the Page: "+driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println("Number of Links in Footer: "+footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Number of Links in Footer Column 1: "+columndriver.findElements(By.tagName("a")).size());
		
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(3000);
		}
		
		Set<String> numofLinks = driver.getWindowHandles();
		Iterator<String> it = numofLinks.iterator();
		
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}

	}

}
