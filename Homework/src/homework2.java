import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homework2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")).sendKeys("Hüseyin");
		driver.findElement(By.name("email")).sendKeys("example@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123456789");
		Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
		driver.findElement(By.id("exampleCheck1")).click();
		//System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("28/10/1999");
		
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText(),
		"Success!");
			
		
	}
}