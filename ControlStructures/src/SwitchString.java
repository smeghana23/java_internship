import java.util.Scanner;
public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter USA or UK");
		country = scnr.next();
		switch(country) {
		
		/*case "USA":
			System.out.println("United State Of America");
			break;
		case "UK":
			System.out.println("United Kingdom");
			break;
		case "usa":
			System.out.println("United State Of America");
			break;
		case "uk":
			System.out.println("United Kingdom");
			break;
		default:
			System.out.println("Invalid country");
			break;*/
		
		// we can place default statement at the top of the switch case
		case "USA":
		case "usa":
			System.out.println("United State Of America");
			break;
		case "UK":
		case "uk":
			System.out.println("United Kingdom");
			break;
		default:
			System.out.println("Invalid country");
			break;
		}

	}

}
