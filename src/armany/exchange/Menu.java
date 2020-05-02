package armany.exchange;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Menu {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.armaniexchange.com/us");

		WebElement element = driver.findElement(By.xpath("//iframe[@src='javascript:void(0)']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		WebElement accout = driver.findElement(By.xpath("//div[@class='my-account secondary-menu-item']"));

		accout.click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();

		driver.quit();
	}

}
