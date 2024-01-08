package week3.day3;

public  class JvaConnection implements DataBaseConnection {

	public static void main(String[] args) {
		
		JvaConnection java =new JvaConnection();
		java.connect();
		java.executeUpdate();
		java.disconnect();
		
		
	}

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect the connection");
		
	}

	public void executeUpdate() {
        System.out.println("execute the updates");	
		
	}
}
		
		
		

	


