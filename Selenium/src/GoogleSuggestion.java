import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSuggestion {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement as = driver.findElement(By.name("q"));
	as.sendKeys("java");
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
	for(WebElement x:list)
	{
		System.out.println(x.getText());
	}
}
}
