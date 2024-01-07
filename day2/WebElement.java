package week3.day2;

public class WebElement {
	String text = " alarm" ;


	public static void main(String[] args) {
		
		WebElement element=new WebElement();
		element.click();
		element.setText();

	}
	public void click() {
		System.out.println("click");
		
	}
	public void setText() {
		System.out.println("set text to " + text);
	}

}
