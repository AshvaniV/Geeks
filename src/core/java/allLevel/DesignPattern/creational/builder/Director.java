package core.java.allLevel.DesignPattern.creational.builder;

public class Director {
	AbstractAircraftFactory aircraftFactory;

	Director(AbstractAircraftFactory aircraftFactory) {
		this.aircraftFactory = aircraftFactory;
	}

	public void construct(Boolean isPassenger) {
		this.aircraftFactory.buildCockpit();
		this.aircraftFactory.buildEngine();
		this.aircraftFactory.buildWings();
		if (isPassenger != null && isPassenger) {
			this.aircraftFactory.buildPassengerAircraft();
		}
		this.aircraftFactory.setAircraft();
	}
}
/*
Director – The director class controls the algorithm that generates the final product [aircraft] object.
A director object is instantiated and its Construct method is called. The method includes a parameter to capture the specific concrete
builder object that is to be used to generate the product. The director then calls methods [aircraftFactory.buildPassanger()]
of the concrete builder in
the correct order to generate the product [aircraft] object. On completion of the process, the GetProduct method of the builder
object can be used to return the product.


Director class receives the builder in the constructor.Unlike creational patterns that construct products in one shot,
 the Builder pattern constructs the product step by step under the control of the "director".
* */