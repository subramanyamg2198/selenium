import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement at = driver.findElement(By.name("username"));
		at.sendKeys("admin");
		Thread.sleep(3000);
		WebElement at1 = driver.findElement(By.name("pwd"));
		at1.sendKeys("manager");
		Thread.sleep(3000);
		WebElement at2 = driver.findElement(By.id("loginButton"));
		at2.sendKeys(Keys.ENTER);
	    at2.click();
		Thread.sleep(3000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title!=title1)
		{
			System.out.println("Login successful");
			
		}
		else
			System.out.println("Login unsuccessful");
		System.out.println("**********");
		WebElement at3 = driver.findElement(By.id("logoutLink"));
		at3.sendKeys(Keys.ENTER);
	    at3.click();
		Thread.sleep(3000);
		System.out.println("successfully logged out of ACTI TIME");
	}
	

}