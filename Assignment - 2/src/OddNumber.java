import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scnr.nextInt();
		
		Odd num = new Odd();
		num.checkNum(number);

	}

}
