package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http:/www.facebook.com/");
        
    WebElement emailid=    driver.findElement(By.id("emailid"));
       emailid.sendKeys("testleaf.2023@gmail.com");
      WebElement password= driver.findElement(By.name("pass"));
       password.sendKeys("Tuna@321");
     WebElement loginBtn=  driver.findElement(By.name("login"));
       loginBtn.click();
       String title=driver.getTitle();
       System.out.println(title);
       if(title.contains("Log in to Facebook"))
    		   
    		   {
    	   System.out.println("Title is verifies");
    	   
    		   }
       else
       {
    	   System.out.println("Title is not verified");
       }
       
	}

}
