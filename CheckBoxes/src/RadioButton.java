import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver  driver =  new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());	
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		driver.findElement(By.xpath("//input[@value='Water']")).click();
	//tagName[@attribute='Value']

	}

}
