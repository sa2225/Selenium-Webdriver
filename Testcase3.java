import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Create driver object here for FireFox browser */
		//gecko driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\workSelenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com"); // hit URL on the browser
		//System.out.println(driver.getTitle()); //Validate if the title is correct
		
		//System.out.println(driver.getCurrentUrl());// validate if we land on current URL
		//System.out.println(driver.getPageSource()); // Print the page source for sites. Useful when view page source is disabled for certain sites
		
		driver.get("https://login.salesforce.com/?locale=in");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); //closes current browser window
		//driver.quit(); //closes all child windows
		//driver.findElement(By.id("email")).sendKeys("This is my first email id");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
