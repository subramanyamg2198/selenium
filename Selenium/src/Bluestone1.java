import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Bluestone1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://bluestone.com/");
	WebElement jewel=driver.findElement(By.xpath("//a[contains(.,'All Jewellery' )]"));
	Actions a=new Actions(driver);
	a.moveToElement(jewel).perform();
	driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
	WebElement kadas=driver.findElement(By.xpath("//img[@alt=\"The Arjun Kada For Him\"]"));
	kadas.click();
	Set<String> wins=driver.getWindowHandles();
	for(String x:wins)
	{
		driver.switchTo().window(x);
	}
	driver.findElement(By.xpath("//a[@href=\"#homeTryOnProduct\"]")).click();
}
}
