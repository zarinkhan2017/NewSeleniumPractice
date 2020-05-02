package gap.feature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewFeature {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.gap.com/");
		Thread.sleep(3000);

		WebElement newArriaval = driver.findElement(By.linkText("New Arrivals"));

		Actions act = new Actions(driver);

		act.moveToElement(newArriaval).perform();

		WebElement modal = driver.findElement(By.className("universal-modal__close-button"));

		modal.click();

		List<WebElement> WomenSize = driver.findElements(By.linkText("Women"));

		for (int i = 0; i < WomenSize.size(); i++) {

			WebElement element = WomenSize.get(0);

			element.click();
		}

		driver.quit();
	}

}
