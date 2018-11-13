import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://spicejet.com/");
	
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
		
		
		/*Select s = new Select (driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		
		s.selectByValue("USD");
		s.selectByIndex(2);
		s.selectByVisibleText("INR"); */
		
		//*[@id='ctl00_mainContent_ddl_originStation1']
		//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']

	}

}
