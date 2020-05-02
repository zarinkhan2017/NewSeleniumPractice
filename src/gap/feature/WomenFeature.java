package gap.feature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WomenFeature {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.gap.com");

		WebElement women = driver.findElement(By.linkText("Women"));

		Actions act = new Actions(driver);

		act.moveToElement(women).perform();

		List<WebElement> womenSize = driver.findElements(By.xpath(
				"//li[@class='topNavLink topNavLink--expanded']//div[@class='meganav-column double-width-column']"));

		int WomenIndex = womenSize.size();

		for (int i = 0; i < WomenIndex; i++) {

			WebElement element = womenSize.get(i);

			WebElement jeans = driver.findElement(
					By.xpath("//li[@class='topNavLink topNavLink--expanded']//span[contains(text(),'Jeans')]"));

			boolean status = element.isEnabled();
			
			System.out.println(status);
			
			if (element.equals(jeans)) {

				element.click();
			}

		}

		driver.quit();

	}

}
