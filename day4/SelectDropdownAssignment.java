package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.name("Login Button")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("mandatoryField")).click();
		
		WebElement sourceWE=driver.findElement(By.id("employee"));
		Select sourceDD=new Select(sourceWE);
		sourceDD.selectByIndex(2);
		
		WebElement ownershipWE=driver.findElement(By.id("ownership"));
		Select ownershipDD=new Select(ownershipWE);
		ownershipDD.selectByValue("Corporation");
		
		WebElement markcampWE=driver.findElement(By.id("markcamp"));
		Select markcampDD=new Select(markcampWE);
		markcampDD.selectByVisibleText("Automobile");
		
		driver.findElement(By.name("Create Lead Button")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View Lead"))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("not verified");
		
		}
				
			
		
		

	}

}
