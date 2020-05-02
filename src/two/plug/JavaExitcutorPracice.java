package two.plug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaExitcutorPracice {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.twoplugs.com");

		WebElement login = driver.findElement(By.linkText("JOIN NOW FOR FREE"));

		login.click();

		System.out.println(driver.findElement(By.className("control-label")).getText());

		WebElement userName = driver.findElement(By.id("signUpUser"));

		userName.sendKeys("borsonkhan");

		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText());

		WebElement email = driver.findElement(By.id("signUpEmail"));

		email.sendKeys("borsonqa@gmail.com");

		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText());

		WebElement password = driver.findElement(By.id("signUpPassword"));

		password.sendKeys("khan2019");

		WebElement signUp = driver.findElement(By.xpath("//button[@type='submit']"));

		signUp.click();

		driver.quit();

	}

}
