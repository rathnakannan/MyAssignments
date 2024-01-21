package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> windows=new ArrayList(windowhandles);
		driver.switchTo().window(windows.get(1));	
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//input[@name='ComboBox_partyIdTo']")).sendKeys("DemoLBCust");
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		String text=driver.getTitle();
		System.out.println(text);
		
		
		
		
		

}
}