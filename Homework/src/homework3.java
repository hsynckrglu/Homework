import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homework3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); 
		

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement staticDropdown =driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector(".btn.btn-info.btn-md")).click();
		
		addItems(driver, wait);
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		

	}
	
	public static void addItems (WebDriver driver, WebDriverWait wait) {
		List<WebElement> addNeeded = driver.findElements(By.cssSelector("h4[class='card-title']"));
		
		for(int i=0;i<addNeeded.size();i++) {


			driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
	}
	

}
