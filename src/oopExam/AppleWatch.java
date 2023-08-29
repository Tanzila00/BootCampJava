package oopExam;

/*
 * Abstract class is a SuperClass. 
 * Its subclasses can override all of its inherited abstract methods.
 * Inside Abstract class it contains both abstract method(only declared)and non abstract method(implemented).
 * Abstract class can inherit one abstract class or one regular class using the keyword extends whereas it can inherit more than one interface using implements keywords.
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	/*
	 * Variable can be declared or initialized. Abstract class can declare
	 * Constructor but cannot instantiate class.
	 */
	public int watchModelYear;
	public String watchModelName = "Series7";

	public AppleWatch() {
		System.out.println("This is a declared constructor from abstract class--AppleWatch");
	}

	public void abstractClassInfo() {// This is the non abstract method that can be implemented.
		System.out.println(
				"Abstract class is a superclass which can inherit one regular class or one abstract class using the keyword extends whereas can inherit more than one interface using keyword implements");
	}

	public abstract void appleWatchInfo();// This is the other method known as abstract method which can only be
											// declared. Its a MUST to use the keyword abstract for this method inside
											// abstract class.
}
