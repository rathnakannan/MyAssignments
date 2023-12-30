package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://en-gb.facebook.com/");
		driver.findElement(By.name("Create new account button")).click();
		driver.findElement(By.id("First Nmae")).sendKeys("Rathna");
		driver.findElement(By.id("Surname")).sendKeys("Bala");
		driver.findElement(By.id("emailid")).sendKeys("rathnakannan9627@gmail.com");
		driver.findElement(By.id("New Password")).sendKeys("KRB");
		
		WebElement dayWE=driver.findElement(By.id("day"));
		Select dayDD=new Select(dayWE);
		dayDD.selectByIndex(8);
		
		
		WebElement monthWE=driver.findElement(By.id("month"));
		Select monthDD=new Select(monthWE);
		monthDD.deselectByValue("November");
		
		WebElement yearWE=driver.findElement(By.id("year"));
		Select yearDD=new Select(yearWE);
		yearDD.deselectByValue("1995");
		
		driver.findElement(By.name("radio button")).click();
		
		WebElement radioWE=driver.findElement(By.id("Gender"));
		Select radioDD=new Select(radioWE);
		radioDD.deselectByIndex(1);
		
		
		
		

	}

}
