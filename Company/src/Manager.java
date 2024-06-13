
public class Manager extends Employee {
	double salary;
	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 0.15 * basicSalary;
		System.out.println("Transport Allowance:" +transportAllowance);
	}

}
