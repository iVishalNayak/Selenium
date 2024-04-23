package co.practiceSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
		
    driver.get("https://google.com");
    
    
 

	}

}
