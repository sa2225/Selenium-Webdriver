import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\workSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		/* driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='switch__input_1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/section[1]/div[1]/div[1]/div[3]/label[1]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed()); */
		
		//if we want to validate if objects are present on the page with this xpath(use size() with findElements)
		int count;
		System.out.println(count=driver.findElements(By.xpath("//div[@class='hp-widget']")).size());
		
		if (count==0)
		{
		System.out.println("Verified");

	}

}
}