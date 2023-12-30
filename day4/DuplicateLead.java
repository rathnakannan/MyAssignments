package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http;//leaftaps.com/opentaps/control/main");
	WebElement	username=driver.findElement(By.id("Username"));
	username.sendKeys("demosalesmanagar");
	WebElement password=driver.findElement(By.id("PASSWORD"));
	password.sendKeys("crmsfa");
	WebElement loginBtn=driver.findElement(By.className("Login button"));
	loginBtn.click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createleadform_CompanyName")).sendKeys("testleaf");
	driver.findElement(By.id("createleadform_FirstName")).sendKeys("Rathna");
	driver.findElement(By.name("createleadform_Department")).sendKeys("Testing");
	driver.findElement(By.name("createleadform_Description")).sendKeys("Automation Tester");
	driver.findElement(By.id("createleadform_emailid")).sendKeys("rathnakannan9627@gmail.com");
	WebElement createBtn=driver.findElement(By.linkText("createbutton"));
	createBtn.click();
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
	
	driver.findElement(By.linkText("Duplicate button")).click();
	driver.findElement(By.id("CompanyName")).clear();
	driver.findElement(By.id("newCompanyName")).sendKeys("TESTLEAF");
	driver.findElement(By.id("FirstName")).clear();
	driver.findElement(By.id("newFirstName")).sendKeys("Kannan");
	driver.findElement(By.name("Create Lead")).click();
	String title1=driver.getTitle();
	System.out.println(title1);
	if(title1.contains("View Lead"))
	{
		System.out.println("verified");
	}
	else
	{
		System.out.println("not verified");
	}
	
	

	}

}
