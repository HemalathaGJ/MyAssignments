package week4.day1;

public abstract class CanaraBank implements Payments{
	
	public void cashOnDelivery() {
		System.out.println("CanaraBank-Cash On Delivery");
	}
	public void upiPayments() {
		System.out.println("CanaraBank-UPI Payments");
	}
	public void cardPayments() {
		System.out.println("CanaraBank-Card Payments");
	}
	public void internetBanking() {
		System.out.println("CanaraBank-Internet Banking");
	}
	public abstract void recordPaymentDetails();
	

}
