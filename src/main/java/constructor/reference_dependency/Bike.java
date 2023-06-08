package constructor.reference_dependency;

public class Bike {
	private int bikeid;
	private String bikename;

	public Bike(int bikeid, String bikename) {
		super();
		this.bikeid = bikeid;
		this.bikename = bikename;
	}

	@Override
	public String toString() {
		return "Bike [bikeid=" + bikeid + ", bikename=" + bikename + "]";
	}

}
