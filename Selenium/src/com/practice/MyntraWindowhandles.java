package com.practice;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyntraWindowhandles {
public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.myntra.com/");
	Thread.sleep(7000);
	WebElement al=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	al.sendKeys("mens shoes",Keys.ENTER);
	WebElement ac=driver.findElement(By.xpath("//img[@class='img-responsive']"));
	ac.click();
	Set<String> wins=driver.getWindowHandles();
	for(String win:wins)
	{
		driver.findElement(By.xpath(""));
	}
}
}
