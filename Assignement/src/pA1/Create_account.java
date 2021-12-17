package pA1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Create_account {
	@Test
	public void Account() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchTextBox= driver.findElement(By.id("firstName"));
		// retrieving html attribute value using getAttribute() method
		String typeValue=searchTextBox.getAttribute("type");
		System.out.println("Value of type attribute: "+typeValue);
		String autocompleteValue=searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: "+autocompleteValue);
		// Retrieving value of attribute which does not exist
		String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
		System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);
		WebElement searchTextBox1= driver.findElement(By.id("lastName"));
		String typevalue1=searchTextBox1.getAttribute("type");
		System.out.println("Value of type attribute: " +typevalue1);
		String autocompleteValue1=searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: "+autocompleteValue1);
		//driver.close();
	}

}
