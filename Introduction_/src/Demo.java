import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Step 1 Create Driver Object for Chrome Browser
// Step 2 Implement methods of WebDriver
// Step 3 Invoke .exe file
// Step 4 Open the browser with the url/site to test
// Step 5 Print out the url title on the console window to make sure the correct site is invoked 		
		/* Syntax for creating an object
		  Class name = X
		 x driver = x(); */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	    System.out.println(driver.getTitle());	
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    //System.out.println(driver.getPageSource());
	    WebDriver driver2 = new ChromeDriver();
	    driver2.get("http://yahoo.com");
	    //driver.navigate().to("http://yahoo.com");
	    System.out.println(driver2.getTitle());	
	    System.out.println(driver2.getCurrentUrl());
		//driver2.navigate().back();
		//driver2.navigate().forward();
		driver2.close(); // closes current browser
		//driver2.quit(); // closes all browsers by selenium
	}

}
