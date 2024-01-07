package week3.day2;

public class ButtonSubClass1 extends WebElement {

	public static void main(String[] args) {
		ButtonSubClass1 button=new ButtonSubClass1();
		button.Submit();
		button.click();
		button.setText();

	}
	public void Submit() {
		System.out.println("click the submit buttton");
		
	}
	

}
