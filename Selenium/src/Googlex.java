import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Googlex {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		WebElement as = driver.findElement(By.name("q"));
		as.sendKeys("java", Keys.ENTER);
		WebElement al = driver.findElement(By.xpath("//a[contains(.,'Images')]"));
		al.click();
		WebElement ac = driver.findElement(By.xpath("//img[@id='rT8rqQKh8jt3DM:']"));
		ac.click();
		
}}
