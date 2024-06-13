
public class Trainee extends Employee {
	double salary;
	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
}
