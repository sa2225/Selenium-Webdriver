import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\workSelenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@tws.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("xyz@");
	}

}
