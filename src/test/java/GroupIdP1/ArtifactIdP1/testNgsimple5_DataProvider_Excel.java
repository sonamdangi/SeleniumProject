package GroupIdP1.ArtifactIdP1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNgsimple5_DataProvider_Excel {
	private WebDriver driver;
	//private String url;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		//url = "http://newtours.demoaut.com/";
		//driver = new FirefoxDriver();
		
		//WebDriver driver = new FirefoxDriver();
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://newtours.demoaut.com/");
	}

	@Test(dataProvider = "Paramters")
	public void Login(String username, String password) {
		//driver.get(url);
		//driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "Login")
	public void logout() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@DataProvider
	public Object[][] Paramters() {
		Object[][] testObjArray=null;
		try {
			testObjArray = ReadExcelData.getTableArray("C:\\Users\\LENOVO\\eclipse-workspace\\ArtifactIdProg1\\src\\test\\java\\GroupIdProg1\\ArtifactIdProg1\\dataprovider1.xls",
					"Sheet2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (testObjArray);
	}

	@AfterClass
	public void closeBrower() {
		//driver.quit();
	}
}
