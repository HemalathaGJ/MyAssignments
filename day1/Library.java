package week2.day1;

import java.util.Scanner;

public class Library {

	public String addBook(String bookTitle) {

		System.out.println("Book added successfully");
		return bookTitle;
	}

	public void issueBook() {

		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		Scanner book = new Scanner(System.in);
		System.out.println("Enter the book name to add:");
		String bookName = book.next();
		lib.addBook(bookName);
		lib.issueBook();

	}

}
