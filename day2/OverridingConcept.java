package week3.day2;

//Parent class
public class OverridingConcept {
	//Declaring a method
	public void display()
	{
		System.out.println("Parent class method");
	}

	public static void main(String[] args) {
		//Creating object for the parent class
		OverridingConcept runtime=new OverridingConcept();
		//invoking the method using the parent class object
		runtime.display();

	}

}
