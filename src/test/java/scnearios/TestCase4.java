package scnearios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase4 {
	WebDriver driver;
	WebDriverWait wait;
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
		  
		  /*//Addign the Cart details few prodcuts
		  
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
		  
		  driver.findElement(By.linkText("1MP 60GB Hard Drive Handycam Camcorder")).click(); */
		  
		  driver.findElement(By.linkText("Shopping cart")).click();
		  
		  Select ddCountry = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
		  
		  ddCountry.selectByVisibleText("India");
		  
		  Thread.sleep(2000);
		  
		  //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("termsofservice")));
		  
		  driver.findElement(By.id("termsofservice")).click();
		  
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  Thread.sleep(2000);
		  
		 /* driver.findElement(By.id("billing-new-address-form")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("Abcd Test");
		  
		  Select ddCountry1 = new Select (driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
		  
		  ddCountry1.selectByValue("41");
		  
		  driver.findElement(By.cssSelector("input[id='BillingNewAddress_City']")).sendKeys("Pune");
		  
		  driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("Abdsgjg gfejhds");
		  
		  driver.findElement(By.cssSelector("input[name='BillingNewAddress.Address2']")).sendKeys("fjdgfddjgfdjjf");
		  
		  driver.findElement(By.cssSelector("input[id='BillingNewAddress_ZipPostalCode']")).sendKeys("415263");
		  
		  driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']")).sendKeys("7896547896");
		  
		  driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("415263");
		  
		  Thread.sleep(2000); */
		  
		  driver.findElement(By.xpath("//input[@title='Continue']")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
		  
		  Thread.sleep(2000);
		  
		  Boolean Checkbox = driver.findElement(By.xpath("//input[@id='PickUpInStore']")).isEnabled();
		  
		  System.out.println("Checkbox on shipping address:  "+Checkbox);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='paymentmethod_0']")));
		  driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button-1 payment-method-next-step-button']")));
		  driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
		  
		  //If we select credit card
		  /*
		  Select ddCreditCard = new Select (driver.findElement(By.id("CreditCardType")));
		  
		  ddCreditCard.selectByVisibleText("Master card");
		  
		  driver.findElement(By.id("CardholderName")).sendKeys("Sravan");
		  
		  driver.findElement(By.id("CardNumber")).sendKeys("415263968574");
		  
		  Select ddCCMonth = new Select (driver.findElement(By.id("ExpireMonth")));
		  
		  ddCCMonth.selectByValue("9");
		  
		  Select ddCCYear = new Select (driver.findElement(By.id("ExpireYear")));
		  
		  ddCCYear.selectByValue("2022");
		  
		  driver.findElement(By.id("CardCode")).sendKeys("456");
		  */
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button-1 payment-info-next-step-button']")));
		  driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")));	  
		  driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
		  
		  System.out.println("Title of the Page  : "+driver.getTitle());
		 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button-2 order-completed-continue-button']")));
		  
		  driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
		  
		  System.out.println("Title of the Page  : "+driver.getTitle()); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log out")));
		  driver.findElement(By.linkText("Log out")).click();
		  System.out.println("Logout Successfully");
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("Executed with After test method");
		  driver.close();
	  }
}
