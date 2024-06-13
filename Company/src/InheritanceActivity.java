
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager peter = new Manager(126534, "peter", "Chennai India", 237844, 65000.00);
		peter.calculateSalary();
		Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000.00);
		jack.calculateSalary();
		
		peter.calculateTransportAllowance();
		jack.calculateTransportAllowance();

	}

}
