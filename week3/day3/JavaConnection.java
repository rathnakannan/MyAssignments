package week3.day3;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

}
