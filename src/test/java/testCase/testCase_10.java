package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase_10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.zomato.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.getTitle();
		Thread.sleep(2000);
		driver.getCurrentUrl();
		Thread.sleep(2000);
		driver.getPageSource();
		Thread.sleep(2000);
		driver.manage();
		driver.quit();
	}
}
