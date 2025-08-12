package week4.day1;
// JavaConnection class inherits the abstract class MySqlConnection
public class JavaConnection extends MySqlConnection {
	@Override
	public void connect() {
		System.out.println("Invoking the connect method from the super class");
		super.connect();
		System.out.println("Connect method implemented in the concrete class");
	}

	@Override
	public void disconnect() {
		System.out.println("Invoking the disconnect method from the super class");
		super.disconnect();
		System.out.println("disconnect method implemented in concrete class");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Invoking the executeUpdate method from the super class");
		super.executeUpdate();
		System.out.println("executeUpdate method implemented in the concrete class");
	}

	@Override
	public void executeQuery() {
		System.out.println("executeQuery method implemented in the concrete class");
	}

	public static void main(String[] args) {
		// Creating an object for JavaConnection class to invoke all the methods
		JavaConnection jc = new JavaConnection();
		jc.connect();
		System.out.println("----------");
		jc.executeUpdate();
		System.out.println("----------");
		jc.executeQuery();
		System.out.println("----------");
		jc.disconnect();
		System.out.println("----------");
	}

}
