package scnearios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
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
	  public void LoginAccount() throws InterruptedException {
		  //driver.get("http://demowebshop.tricentis.com/"); 
		  driver.navigate().to("http://demowebshop.tricentis.com/");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Log in")).click();
		  
		  driver.findElement(By.className("email")).sendKeys("sravana241@gmail.com");
		  driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Abcd@9899");
		  
		  driver.findElement(By.cssSelector("input[value='Log in']")).click();
		  Thread.sleep(3000);
		  
		  //Addign the Cart details few prodcuts
		  
		  driver.findElement(By.linkText("Books")).click();
		  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		 // /html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input
		  
		  driver.findElement(By.linkText("Computers")).click();
		  driver.findElement(By.linkText("Notebooks")).click();
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input")).click();
		  
		  driver.findElement(By.xpath("//*[@id='topcartlink']/a/span[1]")).click();
		  
		  driver.findElement(By.xpath("//input[@name='continueshopping']")).click();
		  
		  Thread.sleep(1000);
		  
		  driver.findElement(By.linkText("Electronics")).click();
		  
		  driver.findElement(By.linkText("Camera, photo")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.linkText("1MP 60GB Hard Drive Handycam Camcorder")).click();
		  
		  driver.findElement(By.xpath("//*[@id='topcartlink']/a/span[1]")).click();
		  
		  Thread.sleep(1000);

		  driver.findElement(By.linkText("Log out")).click();
		  Thread.sleep(3000);
		  System.out.println("Logout Successfully");
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("Executed with After test method");
		  driver.close();
	  }
}
