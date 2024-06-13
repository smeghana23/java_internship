import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scnr.nextInt();
		PrimeNum num = new PrimeNum();
		num.prime(number);

	}

}
