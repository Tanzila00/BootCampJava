package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	public Iphone2() {
		super();
		super.regularClasInfo();// void type method
		super.youtube();// static type method
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.battery();
		super.appleWatchInfo();
		super.pagerInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();

		super.budget = 100;// public variable initialized

		System.out.println("The budget for the iphone2 is:" + budget + "$");
		System.out.println("This is the default constructor for iphone2 class");
	}

	public Iphone2(char userOfIphone2) {
		super();
		super.regularClasInfo();// void type method
		super.youtube();// static type method
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.battery();
		super.appleWatchInfo();
		super.pagerInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();
		super.budget = 2200;// public variable initialized
		System.out.println("The budget for the iphone2 is:" + budget + "$");
		this.userOfIphone2 = userOfIphone2;
	}

	public void iPhone2Info() {

		super.regularClasInfo();// void type method
		super.youtube();// static type method
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.battery();
		super.appleWatchInfo();
		super.pagerInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();
		super.budget = 1000;// public variable initialized
		System.out.println("The budget for the iphone2 is:" + budget + "$");

		System.out.println("This is the default void type method for iphone2 class");
	}

	public void iPhone2Info(char userOfIphone2) {

		super.regularClasInfo();// void type method
		super.youtube();// static type method
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.battery();
		super.appleWatchInfo();
		super.pagerInfo();
		super.wakitokiInfo();
		super.watchInfo();
		super.digitalWatchInfo();
		super.abstractClassInfo();
		super.appleWatchSeries5Info();
		super.budget = 200;// public variable initialized
		System.out.println("The budget for the iphone2 is:" + budget + "$");

		this.userOfIphone2 = userOfIphone2;
	}

	public void dropbox() {
		System.out.println("Dropbox is the void type method inside the iphone2 class");
	}

}
