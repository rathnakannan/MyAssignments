package week3.day2;

public class chromeSubClass1 extends BrowserInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chromeSubClass1 chrome = new chromeSubClass1();
		chrome.openIncognito();
		chrome.clearCache();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();

	}
	public void openIncognito() {
		System.out.println("open incognito");
		
	}
	public void clearCache() {
		System.out.println("clear cache of " + browserName);
		
	}
	

}
