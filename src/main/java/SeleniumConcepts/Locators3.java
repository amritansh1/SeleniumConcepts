package SeleniumConcepts;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Locators3 {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C:/Users/amrit/OneDrive/Documents/Selenium/Driver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"))
WebElement ele = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());



}


}



