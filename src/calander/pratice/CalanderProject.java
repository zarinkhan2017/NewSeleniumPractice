package calander.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderProject {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com");

		WebElement box = driver.findElement(By.id("ctl00_mainContent_view_date1"));

		String date = "5/10";

		calanderJS(driver, box, date);

		driver.quit();

	}

	public static void calanderJS(WebDriver driver, WebElement ele, String date) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].setAttribute", ele);

	}
}
