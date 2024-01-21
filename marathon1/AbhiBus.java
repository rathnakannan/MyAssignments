package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	    driver.findElement(By.xpath("//div[text()='Chennai']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	    driver.findElement(By.xpath("//span[@data-date='13']")).click();
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    String text=driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	    String text2=driver.findElement(By.xpath("//span[@class='buses-availability']")).getText();
	    System.out.println(text2);
	    driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
	    driver.findElement(By.xpath("//span[text()='DU2']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']")).click();
	    driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Search Dropping Point']")).click();
	    driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
	    String text3= driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
	    System.out.println(text3);
	    String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    
	    
	    
	    
	    
	   
	    
	    
		
		
	}
}
