package oopExam;

/*
 * Interface is Blueprint of Class. It cannot be instantiated neither can it create an object.
 * Interface names starts with UpperCase.
 * They follow Camel case or Snake case pattern.
 * Inside Interface method can only be declared and cannot be implemented. Methods declared are all abstract in nature.The keyword abstract is not required to be used when method is declared!
 * Exceptional method that can implemented inside interface is default and static method only. They are non-abstract method and is also implemented!
 
 */

public interface Phone extends Pager, Wakitoki {

	/*
	 * Interface doesn't create a constructor. Variable can only be declared but not
	 * initialized. The declared variable MUST be static and final in nature.
	 */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println(
				"battery is  a default method which is only implemented in interface class and can only be used in Java version 1.8");
	}

	public static void wireless() {
		System.out.println(
				"wireless is  a static method which is implemented in interface class and can only be used in Java version 1.8");
	}
}
