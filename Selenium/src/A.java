import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class A {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(7000);
		WebElement al=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		al.click();
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a=new Actions(driver);
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
			a.moveToElement(name).build().perform();
			Thread.sleep(3000);
		}
	}
}