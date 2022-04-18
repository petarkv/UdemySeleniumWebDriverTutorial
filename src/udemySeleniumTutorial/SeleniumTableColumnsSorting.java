package udemySeleniumTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumTableColumnsSorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();
		
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(1)"));
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstColList.size(); i++) {
			originalList.add(firstColList.get(i).getText());
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}
		
		System.out.println("***************************************");
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		for (String s:copiedList) {  // int i = 0; i < copiedList.size(); i++
			System.out.println(s);
		}
		System.out.println("********* original list *********");
		for (String s:originalList) {
			System.out.println(s);
		}
		Assert.assertTrue(originalList.equals(copiedList));

	}

}
