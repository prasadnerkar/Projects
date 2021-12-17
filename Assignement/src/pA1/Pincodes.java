package pA1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Pincodes {
	public void check() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chennaiiq.com/india/pincode/");
		driver.findElement(By.linkText("Maharashtra")).click();
		WebElement Anandwadi = driver.findElement(By.xpath("//table[contains(@class,'TBox')]/tbody/tr[11]/td[3]"));
		WebElement Amrutwadi = driver.findElement(By.xpath("//table[contains(@class,'TBox')]/tbody/tr[27]/td[3]"));
		       
		String Pincode1 = Anandwadi.getText();
		String Pincode2 = Amrutwadi.getText();
		       
		System.out.println("Two Unique pincodes are :  " +Pincode1 +"  &amp;&amp;  "+Pincode2);
		       
		Assert.assertNotEquals(Pincode1, Pincode2);
		System.out.println("Assert passed");
	  
}
}