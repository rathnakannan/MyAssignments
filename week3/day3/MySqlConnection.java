package week3.day3;

public class MySqlConnection implements DataBaseConnection{

	public static void main(String[] args) {
		MySqlConnection sql=new MySqlConnection();
		sql.connect();
		sql.disconnect();
		sql.executeUpdate();
		sql.executeQuery();

	}

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect the connection");
		
	}

	public void executeUpdate() {
		System.out.println("execute the update");
		
	}
	public void executeQuery()
	{
		System.out.println("execute all the queries");
	}

}
