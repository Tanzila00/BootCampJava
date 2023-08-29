package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println(
				"\n-------------This is the regular class:Iphone1 inheriting abstarct class Applewatch and interface Phone ------------------\n");
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setInfo("2000");
		iphone1.setUser('F');
		iphone1.setMadeInUsa(false);
		System.out.println("\nI bought this phone in " + iphone1.getInfo() + ",The price was " + iphone1.getPrice()
				+ "$,User's sex:<" + iphone1.getUser() + ">and boolean for made in USA is:" + iphone1.isMadeInUsa()
				+ ".\n");

		iphone1.regularClasInfo();
		Iphone1.youtube();// static method so it was called using the class name directly.
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.battery();
		iphone1.appleWatchInfo();
		iphone1.abstractClassInfo();
		iphone1.pagerInfo();
		iphone1.wakitokiInfo();
		iphone1.watchInfo();
		iphone1.digitalWatchInfo();
		iphone1.appleWatchSeries5Info();

		System.out.println(
				"\n---------This is the Interface class: AppleWatch inheriting AppleWatchSeries5 ,Watch and DigitalWatch properties------------------\n");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.appleWatchInfo();
		appleWatch.appleWatchSeries5Info();
		appleWatch.watchInfo();
		appleWatch.digitalWatchInfo();

		System.out.println("\n------------This is the interface -Phone inheriting Pager and Wakitoki-----\n");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.message();
		phone.camera();
		phone.battery();
		phone.pagerInfo();
		phone.wakitokiInfo();
		Phone.wireless();// interface can itself call the static method.

		System.out.println(
				"\n-------------This is the regular class:Iphone2 inheriting Iphone1 properties------------------\n");

		Iphone2 iphone2 = new Iphone2();// default constructor initialized from iphone2
		Iphone2 iphoneParam2 = new Iphone2('F');// parameterized constructor initialized
		iphone2.iPhone2Info();
		iphone2.iPhone2Info('M');
		iphone2.regularClasInfo();
		Iphone2.youtube();// static method so it was called using the class name directly.
		iphone2.dropbox();
		iphone2.interfaceInfo();
		iphone2.call();
		iphone2.message();
		iphone2.camera();
		iphone2.battery();
		iphone2.appleWatchInfo();
		iphone2.abstractClassInfo();
		iphone2.pagerInfo();
		iphone2.wakitokiInfo();
		iphone2.watchInfo();
		iphone2.digitalWatchInfo();
		iphone2.appleWatchSeries5Info();

		System.out.println(
				"\n-------------This is the regular class:Iphone6 inheriting Iphone5 properties------------------\n");
		Iphone6 iphone6 = new Iphone6();
		iphone6.compass();
		iphone6.email();
		iphone6.photos();
		iphone6.iPhone2Info();
		iphone6.iPhone2Info('M');
		iphone6.regularClasInfo();
		Iphone6.youtube();// static method so it was called using the class name directly.
		iphone6.dropbox();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.battery();
		iphone6.appleWatchInfo();
		iphone6.abstractClassInfo();
		iphone6.pagerInfo();
		iphone6.wakitokiInfo();
		iphone6.watchInfo();
		iphone6.digitalWatchInfo();
		iphone6.appleWatchSeries5Info();
		iphone6.materials(200, 500);
		iphone6.materials(300, 600, "400");
		iphone6.materials(300, 400, "900", "1000");
		iphone6.materials(250, "750");
		Iphone6.materials(220, "230", "530");

		// Iphone1 extends Iphone2 and Iphone3-they are called 'hierarchical'
		// inheritance.
		// Iphone6 extends iphone5, iphone5 extends iphone4,iphone4 extends
		// iphone2,iphone2 extends iphone1-they are called 'Multilevel' Inheritance.
		// Iphone3 extends iphhone1.-this is called 'Single' Inheritance.

		System.out.println("\n----------------This is the configuredIphone6 class----------");
		ConfiguredIphone6 cf6 = new ConfiguredIphone6();
		cf6.materials(300, 550);
		cf6.materials(300, 680, "400");
		cf6.materials(305, 420, "980", "100");
		cf6.compass();
		cf6.email();
		cf6.photos();
		cf6.iPhone2Info();
		cf6.iPhone2Info('M');
		cf6.regularClasInfo();
		ConfiguredIphone6.youtube();// static method so it was called using the class name directly.
		cf6.dropbox();
		cf6.interfaceInfo();
		cf6.call();
		cf6.message();
		cf6.camera();
		cf6.battery();
		cf6.appleWatchInfo();
		cf6.abstractClassInfo();
		cf6.pagerInfo();
		cf6.wakitokiInfo();
		cf6.watchInfo();
		cf6.digitalWatchInfo();
		cf6.appleWatchSeries5Info();

	}

}
