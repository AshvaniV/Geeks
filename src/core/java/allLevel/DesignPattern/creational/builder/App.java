package core.java.allLevel.DesignPattern.creational.builder;

public class App {

	public static void main(String[] arr) {

		AbstractAircraftFactory af = new F16Builder();
		Director d = new Director(af);
		d.construct(true);
		IAircraft aircraft = af.getAircraft();
		aircraft.getMaxSpeed();
	}

}
