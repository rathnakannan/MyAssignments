package week3.day2;

public class SafariSubClass3 extends EdgeSubClass2 {

	public static void main(String[] args) {
		SafariSubClass3 safari = new SafariSubClass3();
		safari.fullScreenMode();
		safari.readerMode();
		safari.clearCache();
		safari.navigateBack();
		safari.clearCookies();
		safari.closeBrowser();
		
		

	}
	public void readerMode() {
		System.out.println("reader mode");
		
	}
	public void fullScreenMode() {
		System.out.println("full screen mode");
		
	}

}
