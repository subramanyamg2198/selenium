import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Search {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement as = driver.findElement(By.name("q"));
		as.sendKeys("java", Keys.ENTER);
		WebElement as1 = driver.findElement(By.name("q"));		
		as1.clear();
		Thread.sleep(2000);
		WebElement as2 = driver.findElement(By.name("q"));
		as2.sendKeys("selenium");
		Thread.sleep(1000);
		WebElement button=driver.findElement(By.className("Tg7LZd"));
		button.click();
		
	}
}