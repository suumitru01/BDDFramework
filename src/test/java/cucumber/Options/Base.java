package cucumber.Options;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
	{
	public static WebDriver driver;
	public static WebDriver getDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace-4\\BDDFramework\\src\\test\\java\\config\\global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Old Firefox Data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
	}
	}
