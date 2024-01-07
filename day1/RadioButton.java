package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/WWW.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).isSelected();

	}

}
