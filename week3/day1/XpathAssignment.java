package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.name("Login Button")).click();
		
		driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();
		
		driver.findElement(By.name("Leads Tab")).click();
		
		driver.findElement(By.linkText("Creat Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createleadform-CompanyName']")).sendKeys("CTS");
		driver.findElement(By.xpath("//input[@id='createleadform-FirstName']")).sendKeys("Rathna");
		driver.findElement(By.xpath("//input[@id='createleadform-LastName']")).sendKeys("Bala");
		
		WebElement EmployeeWE=driver.findElement(By.id("createleadform-sourcedropdown"));
		Select EmployeeDD=new Select(EmployeeWE);
		EmployeeDD.deselectByIndex(5);
		
		WebElement markcampWE=driver.findElement(By.xpath("createleadform-MarketingCampaign"));
		Select markcampDD=new Select(markcampWE);
		markcampDD.deselectByVisibleText("Automobile");
		
		WebElement corporationWE=driver.findElement(By.id("createleadform-corporation"));
		Select corporationDD=new Select(corporationWE);
		corporationDD.deselectByValue("Ownership");
		
		driver.findElement(By.name("Create Lead Button")).click();
	
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View Lead"))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("not able to verified");
			
		}
		driver.close();
		
		
		

	}

}
