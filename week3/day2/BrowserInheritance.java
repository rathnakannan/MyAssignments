package week3.day2;

public class BrowserInheritance {
	String browserName="chrome";
	Float browserVersion=12.5f;

	public static void main(String[] args) {
		BrowserInheritance browser= new BrowserInheritance();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();
		
		

	}
	public void openURL() {
		System.out.println("open URL of" + browserName);
		
	}
	public void closeBrowser() {
		System.out.println("close the browser" + browserVersion);
		
	}
	public void navigateBack() {
		System.out.println("navigate back to home page");
		
	}

}
