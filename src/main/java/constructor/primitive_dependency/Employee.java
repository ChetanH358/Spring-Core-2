package constructor.primitive_dependency;

import java.util.Set;

//constructor injection (primitive dependecny -> (8+String)

public class Employee {
	private int empid;
	private String empname;
	private double salary;

//	generate constructors using fields
	public Employee(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	

}
