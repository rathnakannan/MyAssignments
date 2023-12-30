package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.linkText("Login Button")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.name("Description")).sendKeys("Selenium Automation Tester");
		WebElement industryWE=driver.findElement(By.id("industry"));
		Select industryDD=new Select(industryWE);
		industryDD.selectByValue("Computer Software");
		WebElement  ownershipWE=driver.findElement(By.id("ownership"));
		Select ownershipDD=new Select(ownershipWE);
		ownershipDD.selectByVisibleText("S-Corporation");
		WebElement sourceWE=driver.findElement(By.id("source"));
		Select sourceDD=new Select(sourceWE);
		sourceDD.selectByValue("Employee");
		WebElement markcampaignWE=driver.findElement(By.id("marketingcampaign"));
		Select markcampaignDD= new Select(markcampaignWE);
		markcampaignDD.selectByIndex(2);
		WebElement stateWE=driver.findElement(By.id("state"));
		Select stateDD= new Select(stateWE);
		stateDD.selectByValue("Texas");
		driver.findElement(By.name("Create Account")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Account Details"))
		{
			System.out.println("account is verified");
		}
		else
		{
			System.out.println("account is not verified");
		}
		

	}

}
