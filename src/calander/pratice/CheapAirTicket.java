package calander.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheapAirTicket {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.cheapoair.com/flights/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		List<WebElement> radioButton = driver
				.findElements(By.xpath("//input[@class='custom-control-input' and @type='radio']"));

		for (int i = 0; i < radioButton.size(); i++) {

			WebElement radioText = radioButton.get(i);

			String value = radioText.getAttribute("value");

			if (value.equalsIgnoreCase("MULTICITY")) {

				radioText.click();
			}

			Thread.sleep(3000);
		}

		driver.quit();
	}

}
