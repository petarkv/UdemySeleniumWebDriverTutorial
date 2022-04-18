package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();  // ne koristiti xpath koji pocinje sa html
		driver.findElement(By.id("username")).sendKeys("peca.punker@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();

	}

}
