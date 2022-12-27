package Gitthub1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Punitha/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
}
}
