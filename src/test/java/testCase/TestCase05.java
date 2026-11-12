package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase05 {
	
	@Test
	public class BasePage {
		private By shoppingCartHeader = By.xpath("//div[@class='page-title']/h1");
		private WebDriver driver;
		
	}
}
