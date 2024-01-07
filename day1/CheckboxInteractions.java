package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxInteractions {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h5 [text()='Basic Checkbox']")).click();
		driver.findElement(By.xpath("//h5[text()='Notification']")).click();
		String text=driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).getText();
		System.out.println(text);
		if(text=="checked") {
			System.out.println("verified");
			
		}
		else
		{
			System.out.println("not able to verified");
		}
	
	    driver.findElement(By.xpath("//h5[text()='Choose your favourite language(s)']")).click();
	    driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']")).click();
	    driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-check']")).click();//h5[text()='Toggle Switch']
	    driver.findElement(By.xpath("//h5[text()='Toggle Switch']")).click();
	    driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	    driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']")).click();
	    driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).click();
	    driver.findElement(By.xpath("//ul[@data-label='Cities']"));
	    driver.findElement(By.xpath("//label[@for='London']")).click();
	    driver.close();
	   
	   
		   
	   
	    
	    
	    
		
		
	}
}
