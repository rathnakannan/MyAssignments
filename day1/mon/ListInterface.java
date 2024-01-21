package week4.day1.mon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://WWW.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags" +Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']/parent::div")).click();
		String text=driver.findElement(By.xpath("//div[@aria-label='953 Items Found']")).getText();
		System.out.println(text);
		List<WebElement> brandnameWE=driver.findElements(By.xpath("//div[@class='brand']"));
		int namecount=brandnameWE.size();
		System.out.println(namecount);
		for(int i=0; i<namecount;i++)
		{
			WebElement name=brandnameWE.get(i);
			String nameoftheproduct=name.getText();
			System.out.println(nameoftheproduct);
		}

	}

}
