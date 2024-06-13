import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		int id = 0;
		String name = null;
		float amount = 0;
		
		Customer details = new Customer(id, name, amount);
		
		System.out.println("Enter customer id");
		id = scnr.nextInt();
		details.setId(id);
		
		System.out.println("Enter customer name");
		name = scnr.next();
		details.setName(name);
		
		System.out.println("Enter order amount");
		amount = scnr.nextFloat();
		details.setOrderamount(amount);
		
		System.out.println("The details of Customer are");
		System.out.println("Customer id = " + details.getId());
		System.out.println("Customer name = " + details.getName());
		System.out.println("Order amount = " + details.getOrderamount());

	}

}
