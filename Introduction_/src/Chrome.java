import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys("Dutch@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("test");
		 driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	}

}
