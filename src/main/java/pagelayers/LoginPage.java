package pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
		private WebDriver driver;
		private By username_tf = By.name("username");
		private By password_tf = By.name("password");
		private By login_btn = By.xpath("//button[@type='submit']");

		public  LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		public void doLogin(String usn, String psw) {
			driver.findElement(username_tf).sendKeys(usn);
			driver.findElement(password_tf).sendKeys(psw);
			driver.findElement(login_btn).click();
		}

	}


