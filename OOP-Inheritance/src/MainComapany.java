
public class MainComapany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sowmya = new Employee(1564, "Sowmya", "Developer", 200000.00f);
		Manager sai = new Manager(1234, "Sai", "Manager", 400000.00f, 25);
		System.out.println("Employee Details:");
		sowmya.showDetails();
		System.out.println("Manager Details:");
		sai.getdetails();
		sowmya.computeHra();
		sai.computeHra();
		

	}

}

