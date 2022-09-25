import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class homework6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]/input")).click();
		String checkBoxText = driver.findElement(By.xpath("//div[4]/fieldset/label[1]")).getText();
		System.out.println(checkBoxText);

		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		System.out.println(staticDropdown.findElements(By.tagName("option")).size());
		dropdown.selectByVisibleText(checkBoxText);
		
		driver.findElement(By.id("name")).sendKeys(checkBoxText);
		driver.findElement(By.id("alertbtn")).click();
		String popupMessage=driver.switchTo().alert().getText();
		System.out.println(popupMessage);
		
		if(popupMessage.contains(checkBoxText)) {
			
			System.out.println("pop-up ve checkboxtaki isim aynı");
		}
		else {
			System.out.println("pop-up ve checkboxtaki isim aynı değil");
		}
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
