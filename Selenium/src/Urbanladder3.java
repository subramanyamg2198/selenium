import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder3{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(7000);
		WebElement al=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		al.click();
		WebElement ac=driver.findElement(By.xpath("//li[contains(@class,'topnav_item diningunit')]"));
	}}