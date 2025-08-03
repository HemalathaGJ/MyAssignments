package week3.day2;

public class OverloadingConcept {
	
	//Declaring reportStep method with 2 string arguments

	public void reportStep(String msg,String status) {
		System.out.println(msg);
		System.out.println(status);
	}
	//Declaring reportStep method with 2 String and one boolean argument
	public void reportStep(String msg,String status,boolean snap){
		System.out.println(msg);
		System.out.println(status);
		if(snap)
		{
		System.out.println("Snapshot taken");
		}
		else
			System.out.println("Snapshot not taken");
		
	}
	public static void main(String[] args) {
		//Creating object for OverloadingConcept class
		OverloadingConcept polymorphism=new OverloadingConcept();
		
		//Invoking the methods by passing parameters
		polymorphism.reportStep("Two Arguments", "2 Arguments method invoked");
		System.out.println("-----------------------------------");
		polymorphism.reportStep("3 Arguments", "3 arguments method invoked", true);
		
	}

}
