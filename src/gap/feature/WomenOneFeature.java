package gap.feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WomenOneFeature {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.gap.com");

		WebElement women = driver.findElement(By.linkText("Women"));

		Actions act = new Actions(driver);

		act.moveToElement(women).perform();
		driver.findElement(By.xpath("//button[@class='universal-modal__close-button']")).click();

		driver.findElement(By.linkText("Dresses & Jumpsuits")).click();

		Thread.sleep(3000);

		driver.quit();
	}

}
