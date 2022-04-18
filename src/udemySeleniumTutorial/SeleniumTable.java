package udemySeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTable {

	public static void main(String[] args) {
		int sum = 0;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Petar\\MozillaFirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/39423/"
				+ "den-vs-ger-3rd-match-icc-mens-t20-world-cup-europe-qualifier-2021");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		System.out.println(count+"*******");
		System.out.println(rowCount+" - Sledi sadrzaj redova");
		
		for (int i = 0; i < count-2; i++) {			
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 "
					+ "cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger=Integer.parseInt(value);
			sum=sum+valueinteger;
		}
		System.out.println(sum);
		//System.out.println("Extras and Total *********");
		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int totalSumValue=sum+extrasValue;
		System.out.println(totalSumValue);
		
		String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualTotalValue=Integer.parseInt(actualTotal);
		if (actualTotalValue==totalSumValue) {
			System.out.println("Count Matches");
		}else {
			System.out.println("Count Fails");
		}
	}

}
