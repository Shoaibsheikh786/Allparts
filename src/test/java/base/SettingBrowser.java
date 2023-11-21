package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class SettingBrowser {

	public WebDriver driver;
	FileReader browserInfoFile;
	public final Properties PropBrFile = new Properties();

	@BeforeMethod()
	public void setUpBrowser() throws IOException {
		if (driver == null) {
			browserInfoFile = new FileReader(
					System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
			PropBrFile.load(browserInfoFile);
			System.out.println("This is getting called");

		} 
		if (PropBrFile.getProperty("browser").equalsIgnoreCase("chrome")) {
             
			driver=new ChromeDriver();
			driver.get(PropBrFile.getProperty("url"));
			driver.manage().window().maximize();
		}
		else if(PropBrFile.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		//	driver=new FireFoxDriver();   dont have firefox webdriver right now 
			driver.get(PropBrFile.getProperty("url"));
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("WebBrowser Not found");
		}
	}
	
   @AfterTest()
   public void tearDown()
   {
	   if(driver!=null)
	   {
		   driver.quit();
	   }
   }
	


}
