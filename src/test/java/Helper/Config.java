package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver;
	public static void ConfChrome() throws Exception {
		System.setProperty("WebDriver.chrome.driver", Utils.getproprety("TestDriverPath"));
		}
	public static void MaximasWindow () { 
	driver.manage().window().maximize();
	
	}
		public static Actions action;
		
	
public static void attente (long s) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}

