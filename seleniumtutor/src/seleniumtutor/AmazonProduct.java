package seleniumtutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProduct {
	//static Webdriver driver=null;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtut\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");//go to the amazon website
		driver.findElement(By.id("//*[@id='twotabsearchtextbox']")).sendKeys("mobiles");

	}

}
