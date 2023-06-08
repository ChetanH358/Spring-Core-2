package constructor.reference_dependency;

public class Vehicle {
	private String vehicletype;
	private Bike bikes;

	public Vehicle(String vehicletype, Bike bikes) {
		super();
		this.vehicletype = vehicletype;
		this.bikes = bikes;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicletype=" + vehicletype + ", bike=" + bikes + "]";
	}

}
