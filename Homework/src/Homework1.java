

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("1.basma= "+driver.findElement(By.id("checkBoxOption1")).isSelected()); // false döner
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println("1.basma= "+driver.findElement(By.id("checkBoxOption1")).isSelected()); // true döner
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		Thread.sleep(1000);
		
		System.out.println("2.basma= "+driver.findElement(By.id("checkBoxOption1")).isSelected()); 
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected()); // true döner
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println("2.basma= "+driver.findElement(By.id("checkBoxOption1")).isSelected()); // false döner
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //checkbox sayısını verir
		
		
		
	
	
		
	
		
		
	}

}
