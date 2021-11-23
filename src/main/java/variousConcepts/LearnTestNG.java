package variousConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG {

	WebDriver driver;

	browser=null;

	public void readconfig() {
		
try {
	
	InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
	Properties prop = new Properties();
	prop.load(input);
	String browser = prop.getProperty("browser");
	
	}catch(IOException e) {
		
	}
	
		
		
		
	
	
//	@BeforeMethod
//	public void init() throws InterruptedException {
//		
////		How do we define a condition?
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.driver", "Driver\\chromedriver.exe");
//			driver = new ChromeDriver();
//			
//		}else if(browser.equalsIgnoreCase("Firefox")) {
//			
//			
//		}
		
//		System.setProperty("webdriver.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@Test
	public void loginTest() {

//		//Storing element using By class
//		By Username_FIELD = By.xpath("//*[@id=\"username\"]");
//		By Password_FIELD = By.xpath("//*[@id=\"password\"]");
//		By SIGNIN_BUTTON_FIELD = By.xpath("/html/body/div/div/div/form/div[3]/button");
//		
//		driver.findElement(Username_FIELD).sendKeys("demo@techfios.com");
//		driver.findElement(Password_FIELD).sendKeys("abc123");
//		driver.findElement(SIGNIN_BUTTON_FIELD).click();
//		
//		String expectedUsername_FIELD1 = driver.findElement(Username_FIELD).getText();
//		Assert.assertEquals(expectedUsername_FIELD1, "LoginPage" , "Wrong Page");

		Random rnd = new Random();
		int generatedNum = rnd.nextInt(999);

		Random rnd1 = new Random();
		int generateNum = rnd.nextInt(9999);

		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox");

	}

}
