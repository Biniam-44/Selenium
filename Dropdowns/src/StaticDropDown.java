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
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[1]/li[6]/a")).click();
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[1]/li[11]/a)[2]")).click();
		//*[@id='comp-jo1ls0l8input'] //*[@id="comp-jo1ls0l8input"]
		//Select s = new Select (driver.findElement(By.cssSelector("#comp-jo1ljqoxcollection")));
		
		//s.selectByValue("Quality Assurance (QA)");
		
		/*driver.get("https://spicejet.com/");
	
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1\']/option[8]")).click(); */
		
		/*Select s = new Select (driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		
		s.selectByValue("USD");
		s.selectByIndex(2);
		s.selectByVisibleText("INR"); */
		
		//*[@id='ctl00_mainContent_ddl_originStation1']
		//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']

	}

}
