import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Actitime1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.actitime.com/login.do");
		WebElement al=driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input"));
		al.sendKeys("asdfghjk",Keys.ENTER );
	}}