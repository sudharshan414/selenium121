package javaexamples;
interface WebDriver{
	public void openApp();
	public void closeApp();
	
}
class FireFoxDriver implements WebDriver{
	public void openApp() {
		
		System.out.println("open FireFox");
	}
	public void closeApp() {
		System.out.println("close FireFox");
	}
}
public class ChromeDriver implements WebDriver {
	public void openApp() {
		System.out.println("open Chrome");
	}
	public void closeApp() {
		System.out.println("close Chrome");
	}
	public static void main(String args[]) {
		FireFoxDriver ff= new FireFoxDriver();
		ff.openApp();
		ff.closeApp();
		ChromeDriver ch=new ChromeDriver();
		ch.openApp();
		ch.closeApp();
		WebDriver driver=new FireFoxDriver();
		driver.openApp();
		driver.closeApp();
		WebDriver driver1=new ChromeDriver() ;
		driver1.openApp();
		driver1.closeApp();
		
		
	}

}
