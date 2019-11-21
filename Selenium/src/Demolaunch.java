import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Demolaunch {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukari.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		//driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		Set<String> wins=driver.getWindowHandles();
		//wins.remove(parent);
		for(String win : wins)
		{
			System.out.println(win);
			Thread.sleep(2000);
			driver.switchTo().window(win).close();
		}
		ArrayList<String> lst=new ArrayList<>(wins);
			lst.addAll(wins);
		for(int i=lst.size()-1;i<0;i++)
			driver.switchTo().window(lst.get(i)).close();
	}
}																									