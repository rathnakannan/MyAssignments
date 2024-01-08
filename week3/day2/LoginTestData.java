package week3.day2;

public class LoginTestData extends TestData {
	String username="Rathna";
	String password="xyz";

	public static void main(String[] args) {
		LoginTestData ltd= new LoginTestData();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();

	}
	public void enterUsername() {
		System.out.println("enter username as "+ username);
		
	}
	public void enterPassword() {
		System.out.println("enter password as "+ password);
		
	}

}
