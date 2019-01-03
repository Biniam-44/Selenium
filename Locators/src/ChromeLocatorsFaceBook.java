import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLocatorsFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("test");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.ByCssSelector)
		
		/*driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		driver.findElement(By.className("inputtext")).sendKeys("123456");
		
		//driver.findElement(By.id("pass")).sendKeys("1234asd");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.id("loginbutton")).click();  */
	}

}
