package core.java.allLevel.DesignPattern.creational.builder;

public class App {

	public static void main(String[] arr) {
		/*
		 * This design pattern is mainly focused on abstracting the process of object
		 * creation i.e How the Object is created that is being abstracted. whereas in
		 * factory pattern it is mainly which object to create is being abstracted.
		 *
		 * Basically Builder pattern is used to hide the object creation of the class from external entity.

		 * AirCraftDirector :- which uses AirCraftBuilder as constructor,according to
		 * requested builder object creation functionality will invoked by the passed
		 * builder.
		 */
		AbstractAircraftFactory af = new F16Builder();
		Director d = new Director(af);
		d.construct(true);
		IAircraft aircraft = af.getAircraft();
		aircraft.getMaxSpeed();
	}

}
