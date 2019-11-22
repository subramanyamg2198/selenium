import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// driver.findElement(By.id("identifierId")).sendKeys("Rocky");
		// driver.findElement(By.id("identifierId")).click();
		driver.findElement(By.id("identifierId")).sendKeys("Rocky", Keys.ENTER);
		 driver.findElement(By.id("Email")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("since 1998", Keys.ENTER);

	}
}