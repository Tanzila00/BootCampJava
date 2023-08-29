package oopExam;

public class Iphone6 extends Iphone5 {

	public void compass() {
		System.out.println(
				"It is the void type mehtod namead compass for Iphone6 class.Regular class inerits one regular class or abstract class using the keyword extends.");
	}

	// Inheritance concept has been used here to relate the relation from Iphone6 to
	// iphone1.Inheritance is one of the OOP.

	// Polymorphism is the ability of an object to take on many forms.
	// There are two types of Polymorphism:
	// a)Method Overloading/Static Polymorphism/early binding/Compile time
	// polymorphism: happens in compile time.
	// NOT ALLOWED in overloading:same number of parameter, same type of parameter
	// with same position.
	// ALLOWED in overloading:same number of parameter, same type of parameter with
	// different position is allowed.
	// b) Method Overriding/Dynamic Polymorphism/late binding/Run time polymorphism:
	// happens in Run time..
	// ALLOWED in overriding: different methods exist with the same method name with
	// same parameters or signature but with different syntax or logic, it is called
	// method overriding.
	// NOT ALLOWED; same method name,same parameter,same syntax.
	// Static and Final method can't be Override

	// Here we are using the Overloading concept:
	// return type parameterized method-01 is implemented.
	public int materials(int ramPrice, int cameraPrice) {
		int totalPrice = ramPrice + cameraPrice;
		System.out.println("Toatal Price for the material is:" + totalPrice);
		return totalPrice;
	}
//return type parameterized method-02 is implemented 

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int totalPrice2 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("Toatal Price for the material is:" + totalPrice2);
		return totalPrice2;
	}

	// void type method 03 is implemented
	public void materials() {
		System.out.println("This is the void type method named materials for Iphone6 class");
	}

//void type parameterized method 04 is implemented.
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice, String unitPrice) {
		int totalPrice3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + Integer.parseInt(unitPrice);
		System.out.println("The total price for this material is:" + totalPrice3);
	}

	// return type parameterized method 05 which is final implemented.
	// Final method cannot be overloaded and can't be changed.
	// It is not mandatory the final method to be return type
	public final int materials(int ramPrice, String ProcessorPrice) {
		int totalPrice4 = ramPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("The total price for this material is:" + totalPrice4);
		return totalPrice4;
	}

	// Static type method 06 implemented
	// Static method can be overloaded.
	public static int materials(int ramPrice, String ProcessorPrice, String unitPrice) {
		int totalPrice5 = ramPrice + Integer.parseInt(ProcessorPrice) + Integer.parseInt(unitPrice);
		System.out.println("The total price for this material is:" + totalPrice5);
		return totalPrice5;
	}

}
