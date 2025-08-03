package week3.day2;

//Elements class inherits Button class (Button<---Elements)
// This is an Execution class
public class Elements extends Button {

	// Defining main method to invoke methods from other classes by creating objects
	public static void main(String[] args) {
		// Creating an object for Element class
		Elements elements = new Elements();

		// WebElement<----Button<---Elements
		// Invoking click() and setText() methods in WebElement class using the object
		// of Elements class
		elements.click();
		elements.setText("Invoked from Elements class");

		// Invoking submit() method in Button class using the object of Elements class
		elements.submit();

		// WebElement<---TextField
		// Creating an object for TextField class
		TextField txtfld = new TextField();
		// Invoking getText() method in TextField class using its object
		txtfld.getText();

		// WebElement<---Button<---CheckBoxButton
		// Creating an object for CheckBoxButton class
		CheckBoxButton chkbox = new CheckBoxButton();
		// Invoking clickCheckButton() method in CheckBoxButton class using its object
		chkbox.clickCheckButton();

		// WebElement<---Button<---RadioButton
		// Creating an object for RadioButton class
		RadioButton rdo = new RadioButton();
		// Invoking selectRadioButton() method in RadioButton class using its object
		rdo.selectRadioButton();

	}

}
