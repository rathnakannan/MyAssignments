package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week3.day2.WebElement;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title=="Dashboard") {
			System.out.println("verified");
		}
		else {
			System.out.println("not able to verified");
		}
		boolean button=driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).isEnabled();
		System.out.println(button);
		if(button==true) {
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is disabled");
		}
		String text=driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']")).getText();
		System.out.println(text);
		
		String saveButton=driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getText();
		System.out.println(saveButton);
		
		String heightWidth=driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getText();
		System.out.println(heightWidth);
		
		
		
		
		
		
			
			
		
		
		

	}

}
