package AmazonPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AmzonHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ActualText = "Hello, Sign in";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("nav-hamburger-menu"));
		// WebElement monthdd=driver.findElement (By.xpath("//select[@id='month']"));
		// String Text1 =
		// driver.findElement(By.xpath("//div[@id='hmenu-customer-profile-right']")).getText();
		// System.out.println(Text1);
		// if (ActualText.contentEquals(Text1)) {
		// System.out.println("Matched");

		// }
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Actions action = new Actions(driver);
		Select ListDrop = new Select(dropdown);
		ListDrop.selectByIndex(4);
		System.out.println(dropdown.getSize());
		System.out.println(dropdown.getText());
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirt");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		// driver.findElement(By.xpath("//a[@class='nav-sprite nav-logo-tagline
		// nav-prime-try']")).click();
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/span[1]/span[1]")).click();
		// driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		WebElement prime = driver.findElement(By.linkText("Try Prime"));
		if (prime.isDisplayed()) {
			prime.click();
			System.out.println(prime.isDisplayed());
		}
		//(By,xpath("//img[contains(@src,'images/style/default/menubar_menubutton.png')]"));
		driver.findElement(By.xpath("//img[contains(@src,'https://images-na.ssl-images-amazon.com/images/G/01/digital/video/merch/2020/Movie/TPZO/GWBleedingHero_1500x600_Final_en_US_TPZO_PVD3791._CB426681381_.jpg')]")).isDisplayed();

	}

}
