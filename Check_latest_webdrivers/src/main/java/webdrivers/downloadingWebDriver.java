package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome	.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;;

public class downloadingWebDriver {
	
	 private static WebDriver driver;
	
	
	  @BeforeTest
	    public static void setupClass() throws InterruptedException {
		  System.out.println("Getting chrome driver");
		  
		  WebDriverManager.chromedriver().setup();
		 
		 System.out.println("got latest driver");
		 
		  driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        System.out.println("Maximizing window");
	        driver.get("https://www.flipkart.com");
	        Thread.sleep(4000);

	    }


	    @AfterTest
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void test() {
	        System.out.println("Inside Test...........");
	    }
  }

