package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wappalyzer {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url_load()
	{
		driver.get("http://www.wappalyzer.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void check()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/header/div/div/div/div[3]/button/span/span/svg/path")).click();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/nav/div[1]/div[2]/div/a[1]/div")).click();
	//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]")).sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]")).sendKeys("Java");
		}
	
}
