import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create driver object here for FireFox browser */
		//gecko driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\workSelenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
