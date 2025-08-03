package week3.day2;

public class OverridingConceptChild extends OverridingConcept{
	//Declaring a method with the same name as the parent class
	public void display()
	{
		//invoking parent class method
		super.display();
		System.out.println("Child class method");
	}


public static void main(String[] args) {
	//Creating object for the child class
	OverridingConceptChild runtime1=new OverridingConceptChild();
	//invoking the method using child class object
	runtime1.display();

	}

}
