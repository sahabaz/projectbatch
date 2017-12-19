package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\geckodriver.exe");
//		FirefoxDriver d = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
	}
}
