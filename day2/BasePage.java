package week3.day2;

public class BasePage {
	
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("Parent class find element method");

	}
	public void clickElement() {
		// TODO Auto-generated method stub
		System.out.println("Parent class click element method");

	}
	public void enterText() {
		// TODO Auto-generated method stub
		System.out.println("Parent class enter text method");

	}
	public void performCommonTasks() {
		// TODO Auto-generated method stub
		System.out.println("Parent class perform common tasks method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage bp=new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
		

	}

}
