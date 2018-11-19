import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");
	
		WebDriver  driver =  new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		driver.findElement(By.xpath("//*[@id=\'dropdownGroup1\']/div/ul[1]/li[6]/a")).click();
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[1]/li[11]/a)[2]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_chk_SeniorCitizenDiscount\']")).isSelected());
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_chk_SeniorCitizenDiscount\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_chk_SeniorCitizenDiscount\']")).isSelected());	

	}

}
