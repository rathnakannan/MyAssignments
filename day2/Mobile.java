package week1.day2;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile contacts=new Mobile();
		contacts.sendMsg();
		contacts.makeCall();
		System.out.println("this is my mobile");
		

	}
	public void makeCall()
	{
		System.out.println("make call to mom");
		String mobileMode="samsung";
		float mobileWeight=100.50f;
	}
	public void sendMsg()
	{
		  System.out.println("send msg to dad");
		  boolean isFullyCharged=true;
		  int mobileCost=16000;
		
	}

}
