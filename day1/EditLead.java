package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import week3.day2.WebElement;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rathna");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("RathnaKnnan");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("AutomationTesting");
		driver.findElement(By.xpath("//textarea[@name='description']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("rathnakannan@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
		
		

	}

}
