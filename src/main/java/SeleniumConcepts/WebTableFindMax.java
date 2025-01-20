package SeleniumConcepts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableFindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/amrit/OneDrive/Documents/Selenium/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nseindia.com/option-chain");
		driver.manage().window().maximize();
	
		List<WebElement> tableRow=driver.findElements(By.xpath("//table[@id='optionChainTable-indices']/thead/tr/th"));
//		tableRow.
//		
//		List<WebElement> tableColumn=driver.findElements(By.xpath(""));
		System.out.println("Table size "+tableRow.size());
		String maxString;
		int maxCount=0;
		int count;
		for(int i=0;i<tableRow.size();i++) {
			System.out.println("Inside for ");
			
		
			maxString=driver.findElement(By.xpath("//table[@id='optionChainTable-indices']/tbody/tr["+(i+6)+"]/td[11]")).getText();
			count=Integer.parseInt(maxString);
			if(count>maxCount) {
				maxCount=count;
			}
		
		}
		System.out.println("Max Value= "+maxCount);
		
		
	}

}
