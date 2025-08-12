package week4.day1;

public interface DatabaseConnection {
	// Declaring abstract methods
	void connect();
	void disconnect();
	void executeUpdate();
}
