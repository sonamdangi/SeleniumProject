package GroupIdP1.ArtifactIdP1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _3TestNGParameterAnnotationForLoginTest {
	public WebDriver driver;
	private String url;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		//url = "http://newtours.demoaut.com/";
		WebDriver driver =new FirefoxDriver();
		//driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get(url);
		driver.get("http://newtours.demoaut.com/");
	}

	
	@Test(parameters = {"username","password"})
	public void Login(String username, String password) {
		//driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

	}

	@Test(dependsOnMethods = "Login")
	public void logout() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@AfterClass
	public void closeBrower() {
		driver.quit();
  }
}
