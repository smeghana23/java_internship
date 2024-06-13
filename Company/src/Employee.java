
public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	final double SPECIALALLOWANCE = 250.80;
	final double HRA = 1000.50;
	
	public Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * SPECIALALLOWANCE / 100) + (basicSalary * HRA / 100);
		System.out.println("Salary is:" +salary);
	}
	public void calculateTransportAllowance() {
		double transportAllowance =  0.10 * basicSalary;
		System.out.println("Transport Allowance:" +transportAllowance);
	}

}
