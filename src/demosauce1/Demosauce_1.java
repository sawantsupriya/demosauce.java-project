package demosauce1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosauce_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/manoj/Desktop/Automation folder/Browser extension/chromedriver");
		Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		//Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//passward
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//login
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//Add to card
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		
		//Cheaking product id added or not
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);
		
		//Cheakut
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		//Enter First Name
		driver.findElement(By.id("first-name")).sendKeys("Supriya");
		Thread.sleep(2000);
		
		//Enter Last Name 
		driver.findElement(By.id("last-name")).sendKeys("Gadkar");
		Thread.sleep(2000);
		
		//Enter Poster code 
		driver.findElement(By.id("postal-code")).sendKeys("413501");
		Thread.sleep(2000);
		
		//Click on Continue
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		//Click on finish
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		//Back to home 
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
	}

	
}
