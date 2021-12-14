package pA1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WIthout_sendkeys {
	@Test
	public void Run() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 //Next button element
		 WebElement nextBtn = driver.findElement(By.id("identifierId"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 //code to enter value in the email textbox
		 js.executeScript("document.getElementById('identifierId').value='testmail'");
		 //code to click on next button
		 js.executeScript("arguments[0].click();", nextBtn);
		 //driver.close();

	}

}
