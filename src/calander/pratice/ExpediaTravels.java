package calander.pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpediaTravels {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.expedia.com/");

		WebElement checkin = driver.findElement(By.id("package-departing-hp-package"));

		checkin.click();

		WebElement ele = driver.findElement(By.xpath("//div[@class='datepicker-cal']"));

		WebElement month = ele.findElement(By.xpath("//div[@class='datepicker-cal-month']"));

		List<WebElement> date = month.findElements(By.xpath("//table[@class='datepicker-cal-weeks']//td"));

		for (int i = 0; i < date.size(); i++) {

			String text = date.get(i).getText();

			System.out.println(text);

			if (month.equals("31")) {

				date.get(i).click();

			}

		}

		driver.quit();
	}

}
