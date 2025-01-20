package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableFindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amrit\\OneDrive\\Documents\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath(""))
		List<WebElement> l=driver.findElements(By.xpath("//table[@id='tab1Ganier']/tbody/tr"));
		int max=0;
		for(int i=0;i<l.size();i++) {
			String LTP=driver.findElement(By.xpath("//table[@id='tab1Ganier']/tbody/tr"+i+1+"/td[2]")).getText();
			int value=Integer.parseInt(LTP);
			if(value>max)
				max=value;
		}
		System.out.println("Max LTP is :"+max);
	}

}
