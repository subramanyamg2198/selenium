import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Xpath {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement as=driver.findElement(By.xpath("//label[@for='email']"));
		System.out.println(as.getText());
		WebElement pas=driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pas.getText());
		}
}
