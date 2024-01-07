package week3.day2;

public class EdgeSubClass2 extends chromeSubClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeSubClass2 edge=new EdgeSubClass2();
		edge.clearCookies();
		edge.takeSnap();
		edge.closeBrowser();
		edge.navigateBack();
		edge.clearCache();

	}
	public void takeSnap() {
		System.out.println(" take snap of" );
		
	}
	public void clearCookies() {
		System.out.println("clear cookies");
		
	}

}
