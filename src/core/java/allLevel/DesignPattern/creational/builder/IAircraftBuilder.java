package core.java.allLevel.DesignPattern.creational.builder;

public interface IAircraftBuilder {

	public void buildCockpit();

	public void buildWings();

	public void buildEngine();

	public IAircraft getAircraft();

	void setAircraft();
}
