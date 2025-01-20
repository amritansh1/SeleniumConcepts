package SeleniumConcepts;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SwitchWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amrit\\OneDrive\\Documents\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		
		Actions a = new Actions(driver);
//		driver.findElement(By.xpath("//span[contains(text(),'Cameras & Photography']")).click();
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Cameras & Photography')]"))).keyDown(Keys.SHIFT).click().build().perform();
		String s=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		for(String win:s1) {
			driver.switchTo().window(win);
		}
		
		
	}
}
