import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework8 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebElement SwitchToAlertExample=driver.findElement(By.id("name"));
//		SwitchToAlertExample.click();
//		SwitchToAlertExample.sendKeys("123456");
//		System.out.println(SwitchToAlertExample.getAttribute("value"));
		
		WebElement dropDown = driver.findElement(By.id("autocomplete"));
		dropDown.sendKeys("ind");
		Thread.sleep(2000);
		for(int i = 1; i<3; i++) {
			dropDown.sendKeys(Keys.DOWN);
		}
		/*.getAttritube("value") ile o yoldaki değeri aldım ve sysout ile yazdırdım konsola.
		value yerine "placeholder" yazdırsaydım bu seferde placeholderdaki değeri getirecekti */
		System.out.println(dropDown.getAttribute("value"));

		
		
		

	}

}
