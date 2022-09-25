import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		WebElement table = driver.findElement(By.id("product"));
		System.out.println("Satır sayısı= " + table.findElements(By.tagName("tr")).size());
		System.out.println(
				"Sütun sayısı= " + table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> fourthDrow = table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
		System.out.println(fourthDrow.get(0).getText() + "/" + fourthDrow.get(1).getText() + "/" + fourthDrow.get(2).getText());
	}

}
