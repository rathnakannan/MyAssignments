package week3.day2;

public class APIClient {

	public static void main(String[] args) {
		APIClient client=new APIClient();
		client.sendRequest("xyz");
		client.sendRequest("xyz","abc",true);

	}
	
	public void sendRequest(String endpoint) {
		System.out.println("request sent to" + endpoint);
		
	}
	public void sendRequest(String endpoint, String requestbody, boolean requeststatus) {
		System.out.println("sendrequest to" + endpoint);
		System.out.println("sendrequest to" + requestbody);
		System.out.println("requeststatus is" + requeststatus);
		
	}
	
	}


