package MultipleWindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeOne {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.online.citibank.co.in");

		WebElement iframe = driver.findElement(By.id("vizury-notification-template"));

		driver.switchTo().frame(iframe);

		driver.findElement(By.id("div-close")).click();

		driver.switchTo().activeElement().findElement(By.xpath(".//*[@id='topMnuhomeloans']")).click();


		Thread.sleep(2000);

		driver.quit();
	}

}
