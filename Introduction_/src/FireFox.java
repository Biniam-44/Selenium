import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1 Create Driver Object for Firefox Browser
		// Step 2 Implement methods of WebDriver
		// Step 3 Invoke .exe file
		// Step 4 Open the browser with the url/site to test
		// Step 5 Print out the url title on the console window to make sure the correct site is invoked 		
				/* Syntax for creating an object
				  Class name = X
				 x driver = x(); */	
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\nebiy\\Desktop\\Selenium\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver ();
    driver.get("https://google.com");
    System.out.println(driver.getTitle());
	}

}
