package oopExam;

/*
 * Iphone1 is the regular class.Its the Blueprint from which the objects are created.
 * Regular class can inherit one regular class or one abstract class using the keyword extends whereas can inherit more than one Interface using the keyword implements.
 */

public class Iphone1 extends AppleWatch implements Phone {

	/*
	 * 2) Here the variables are declared as private. These private variables can be
	 * accessed by using getter and setter method. This concept is known as
	 * Encapsulation method.
	 * 
	 */
	private int price;
	private String info;
	private char user;
	private boolean madeInUsa;

	public int budget;

	public Iphone1() {
		System.out.println("This is the default constructor for Iphone1 class");
	}

	public Iphone1(int price, String info, char user, boolean madeInUsa) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUsa = madeInUsa;
	}

	/*
	 * 3) Again, here in Iphone1, we got 4 private variables we know. Create 2
	 * constructors inside it using that 4 private variables -- default and
	 * parameterized after those variables (obviously before methods and after
	 * variables), now go to Iphone2 class.
	 */

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUsa() {
		return madeInUsa;
	}

	public void setMadeInUsa(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
	}

	public void regularClasInfo() {
		System.out.println(
				"Regular class can inherit one regular class or one abstract class using the keyword extends whereas it can inherit more than one Interface by using the keyword implements");
	}

	public static void youtube() {
		System.out.println("This is the static method named youtube from the regular class-- Iphone1");
	}

	@Override
	public void interfaceInfo() {
		System.out
				.println("This is the abstract type method named interfaceInfo implemented in regular class-Iphone1 ");

	}

	@Override
	public void call() {
		System.out.println("This is the abstract type method named call implemented in regular class-Iphone1");

	}

	@Override
	public void message() {
		System.out.println("This is the abstract type method named message implemented in regular class-Iphone1");

	}

	@Override
	public void camera() {
		System.out.println("This is the abstract type method named camera implemented in regular class-Iphone1");

	}

	@Override
	public void appleWatchInfo() {
		System.out.println("This is the abstract type method named message implemented in regular class-Iphone1");

	}

	@Override
	public void pagerInfo() {
		System.out.println("This is the abstract type method pagerInfo message implemented in regular class-Iphone1");
	}

	@Override
	public void wakitokiInfo() {
		System.out.println("This is the abstract type method named wakitokiInfo  implemented in regular class-Iphone1");

	}

	@Override
	public void watchInfo() {
		System.out.println("This is the abstract type method named watchInfo implemented in regular class-Iphone1");
	}

	@Override
	public void digitalWatchInfo() {
		System.out.println(
				"This is the abstract type method named digitalWatchInfo implemented in regular class-Iphone1");

	}

}
