package calander.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheapFlightCalander {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.cheapflights.com/");

		Thread.sleep(2000);

		driver.findElement((By.xpath("//button[contains(text(),'close')]"))).click();

		driver.findElement(By.xpath("//div[contains(text(),'Depart')]")).click();

		driver.findElement(By.xpath("//div[@aria-label='October 8']")).click();

		driver.quit();
	}

}
