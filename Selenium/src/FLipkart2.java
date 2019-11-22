import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FLipkart2  {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		WebElement al=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		al.click();
		driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::ul[@class='QPOmNK']/li[@class='_1KCOnI _3ZgIXy']/a[@title='Mi']"));
	}}