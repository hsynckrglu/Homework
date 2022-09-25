import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}
 
}
