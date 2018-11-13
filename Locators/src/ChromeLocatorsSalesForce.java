import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLocatorsSalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("test User");
		driver.findElement(By.cssSelector("#password")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());	
		//*[@id='forgot_password_link']
		
			//#error
		////*[@id="error"]
		////*[@id="Login"]
		//driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		//driver.findElement(By.className("inputtext")).sendKeys("123456");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.id("pass")).sendKeys("1234asd");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.id("loginbutton")).click(); 
		
	}

}
