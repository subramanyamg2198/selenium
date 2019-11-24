import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Demolaunch1 {
	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("Rocky");
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("Rocky-Bhai");
	WebElement login=driver.findElement(By.id("loginbutton"));
	login.click();
	}
}
