package week3.day2;

public class APIClient {
	// Defining sendRequest method with 1 input argument
	public void sendRequest(String endPoint) {

		System.out.println("The endPoint url is " + endPoint);

	}

	// Defining sendRequest method with 3 input arguments
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {

		System.out.println("EndPoint url is " + endPoint + "\nRequest Body is " + requestBody + "\nRequest Status is "
				+ ((requestStatus == true) ? "Success" : "Failed"));
		;

	}

	public static void main(String[] args) {
		// Creating an object for the APIClient class
		APIClient client = new APIClient();
		// Invoking sendRequest method with 1 input argument
		client.sendRequest("https://www.facebook.com");
		// Invoking sendRequest method with 3 input arguments
		client.sendRequest("https://www.facebook.com", "\"Message:This is my new post\"", true);

	}

}
