package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("beng");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
						
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text

		//JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		int i=0;
		// BENGALURU AIRPORT
		while (!text.equalsIgnoreCase("BENGALURU AIRPORT")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
			if (i>10) {
				break;
			}
		}
		
		if (i>10) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found");
		}

	}

}
