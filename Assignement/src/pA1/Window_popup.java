package pA1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class Window_popup {
	@Test
	public void popup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.id("button1")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//driver.close();
	}
}
