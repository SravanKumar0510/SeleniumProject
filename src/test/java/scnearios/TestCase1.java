package scnearios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestCase1 {
 WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	// Declaring for Chrome WebDriver
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishn\\OneDrive\\Desktop\\SeleniumTrainingApr20\\chromedriver.exe");
	  driver = new ChromeDriver();
	   
	   // Declaring for IE Driver
	 //  System.setProperty("webdriver.ie.driver", "C:\\Users\\Krishn\\OneDrive\\Desktop\\SeleniumTrainingApr20\\IEDriverServer.exe");
	  // driver = new InternetExplorerDriver();
	   
	   // Declaring for Gecko Driver - Firefox
	  /*  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Krishn\\OneDrive\\Desktop\\SeleniumTrainingApr20\\geckodriver.exe");
	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette",true);
	    driver= new FirefoxDriver(capabilities); 
	    */   
	  
	 // to maximize the window
	  driver.manage().window().maximize();
	  System.out.println("Waited");
  }
  
  @Test
  public void RegisterAccount() throws InterruptedException {
	  //driver.get("http://demowebshop.tricentis.com/"); 
	  driver.navigate().to("http://demowebshop.tricentis.com/");
	  driver.findElement(By.className("ico-register")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("gender-male")).click();
	  driver.findElement(By.name("FirstName")).sendKeys("Sravan");
	  driver.findElement(By.name("LastName")).sendKeys("Kumar");
	  driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("sravana241@gmail.com");
	  driver.findElement(By.name("Password")).sendKeys("Abcd@9899");
	  driver.findElement(By.name("ConfirmPassword")).sendKeys("Abcd@9899");
	  driver.findElement(By.id("register-button")).click();
	  
	  System.out.println("Account Created Successfully");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Executed with After test method");
	  driver.close();
  }

}
