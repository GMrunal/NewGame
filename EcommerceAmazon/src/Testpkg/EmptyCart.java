package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmptyCart {
	WebDriver driver = new ChromeDriver();
  @Test
  public void f() {
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
	  driver.getTitle();
	  driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
  }
  @Test
  public void addItems() throws InterruptedException {
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/"); 
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirt");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
  }
}
