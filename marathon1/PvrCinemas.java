package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(4000);
		
		WebElement genreWE=driver.findElement(By.xpath("//select[@name='genre']"));
		Select genreDD=new Select(genreWE);
		genreDD.selectByVisibleText("ANIMATION");
		
		
		WebElement langWE=driver.findElement(By.xpath("//select[@name='lang']"));
		Select langDD= new Select(langWE);
		langDD.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=12']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	    
	    WebElement cineWE=driver.findElement(By.xpath("//select[@name='cinemaName']"));
	    Select cineDD=new Select(cineWE);
	    cineDD.selectByVisibleText("PVR Sathyam Royapettah");
	    
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("rathna"+Keys.ENTER);
	    
	    WebElement timeWE=driver.findElement(By.xpath("//select[@name='timings']"));
	    Select timeDD= new Select(timeWE);
	    timeDD.selectByIndex(1);
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
	    driver.findElement(By.xpath("//span[text()='24']")).click();
	    driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2"+Keys.ENTER);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rathnakannan@gmail.com"+Keys.ENTER);
	    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1234567890"+Keys.ENTER);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("popcorn"+Keys.ENTER);
	    
	    WebElement reqWE=driver.findElement(By.xpath("//select[@name='food']"));
	    Select reqDD=new Select(reqWE);
	    reqDD.selectByIndex(1);
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		

	}

}
