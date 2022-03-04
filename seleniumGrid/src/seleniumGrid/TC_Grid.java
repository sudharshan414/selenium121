package seleniumGrid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC_Grid {
public static void main(String[]args)throws Exception {
	System.setProperty("webdriver.chrome.driver","‪F:\\Drivers\\chromeDriver\\chromedriver.exe");
DesiredCapabilities caps=new DesiredCapabilities();
caps.setBrowserName("chrome");
//ChromeOptions ff=new CHROME_OPTIONS();
//caps.setVersion("20");
caps.setPlatform(Platform.WINDOWS);
URL urlHub=null;
urlHub=new URL("http://localhost:5556/wd/hub");
RemoteWebDriver driver=new RemoteWebDriver(urlHub,caps);
driver.navigate().to("http://183.82.125.5/nareshit/login.php");
//driver.navigate().to("http://www.google.com/");
Thread.sleep(2000);
System.out.println(driver.getTitle());
System.out.println("Application opened");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login Compleated");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logot Compleated");
driver.close();
}
}


