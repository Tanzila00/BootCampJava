package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	// Here we are using the Override concept:
	// return type parameterized method-07 is implemented.
	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int totalPrice6 = ramPrice / 2 + cameraPrice;
		System.out.println("Total Price for the material is:" + totalPrice6);
		return totalPrice6;
	}

//return type parameterized method-08 is implemented.
	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int totalPrice7 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + 30;
		System.out.println("Total Price for the material is:" + totalPrice7);
		return totalPrice7;
	}
	// void type method 09 is implemented.

	@Override
	public void materials() {
		System.out.println("This is the void type method named materials for Iphone6 class");
	}

//void type parameterized method 10 is implemented
	@Override
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice, String unitPrice) {
		int totalPrice8 = ramPrice / 3 + cameraPrice + Integer.parseInt(ProcessorPrice) + Integer.parseInt(unitPrice)
				+ 20;
		System.out.println("Total price for this material is:" + totalPrice8);
	}
//Final type method can't be Overriden.
	// public final int materials(int ramPrice, String ProcessorPrice) {
	// int totalPrice4=ramPrice+Integer.parseInt(ProcessorPrice);
	// System.out.println("The total price for this material is:"+totalPrice4);
	// return totalPrice4;
	// }

	/*
	 * Static type method can't be Overriden. If we remove @Override it will work as
	 * static method of this configurediphone6 class
	 */

	// public static int materials (int ramPrice,String ProcessorPrice,String
	// unitPrice) {
	// int
	// totalPrice5=ramPrice+Integer.parseInt(ProcessorPrice)+Integer.parseInt(unitPrice);
	// System.out.println("The total price for this material is:"+totalPrice5);
	// return totalPrice5;
}
