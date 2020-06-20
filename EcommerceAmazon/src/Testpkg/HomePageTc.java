package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTc {
	WebDriver driver = new ChromeDriver();

	@Test
	public void placeOrder() throws InterruptedException {
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.toString());
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("makeupkit");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/81UR9svJCWL._AC_UL320_ML3_.jpg']"))
				.click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abc123455");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123455");
		driver.findElement(By.xpath("//input[@id='auth-captcha-guess']")).sendKeys("afas");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123455");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		//driver.close();
	}
	 @Test
	  	public void orderComplete() {
	  		driver.manage().window().maximize();
	  		driver.get("https://www.amazon.com/Profusion-Cosmetics-Eyeshadows-Highlighters-Highlighter/dp/B018Q02H8I/ref=sr_1_1?dchild=1&keywords=makeup+kit&qid=1584759426&sr=8-1");
	  		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	  		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com");
	  		driver.findElement(By.xpath("//input[@id='continue']")).click();
	  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123455");
	  		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  		driver.findElement(By.xpath("//input[@id='auth-captcha-guess']")).sendKeys("afas");
	  		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123455");
	  		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  		//driver.quit();
	  		
	  	}

}
