package week4.day1;

// The class DBConnection implementing the interface DatabseConnection
public class DBConnection implements DatabseConnection {
	// Implementing all the abstract methods of the interface
	public void connect() {
		System.out.println("Connected to DB");
	}

	public void disconnect() {
		System.out.println("Disconnected from DB");
	}

	public void executeUpdate() {
		System.out.println("Query executed and data updated in the DB");
	}

	public static void main(String[] args) {
		// Creating object for this concrete class and invoking the methods
		DBConnection db = new DBConnection();
		db.connect();
		db.executeUpdate();
		db.disconnect();
	}

}
