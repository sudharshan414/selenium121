package hrms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC001{
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","‪F:\\Drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login compleated");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout compleated");
		driver.close();
	}
	
}
	

