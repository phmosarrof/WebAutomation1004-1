package abc_practices;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;

=======
>>>>>>> 780f2c1b4088cc29cbbb8016acee5740495fca98
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import static org.junit.Assert.assertEquals;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("Privacy"))
			System.out.println("The test passed");
		else
			System.out.println("The test failed");
		
		Assert.assertEquals(true,driver.getPageSource().contains("Privacy"));
		Assert.assertEquals(0,2-2);
<<<<<<< HEAD
		driver.navigate().back();
		
		driver.findElement(By.linkText("Terms")).click();
		if(driver.getPageSource().contains("Terms"))
			System.out.println("The test passed");
		else
			System.out.println("The test failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.linkText("Settings")).click();
		if(driver.getPageSource().contains("Settings"))
			System.out.println("The test passed");
		else
			System.out.println("The test failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Settings"));
		Assert.assertEquals(3, 5-2);
		
		Thread.sleep(4000);
		
=======

		Thread.sleep(5000);
>>>>>>> 780f2c1b4088cc29cbbb8016acee5740495fca98
		driver.close();
		
		
		
	

	
	}

	}



	
	


