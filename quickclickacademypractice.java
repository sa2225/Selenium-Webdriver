import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quickclickacademypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\workSelenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		//driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		//driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).getAttribute("role"));
	}

}
