import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTypeExceptionDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		try {
			System.out.println( "Enter an int value");
			num = scnr.nextInt();
		} catch(InputMismatchException imex) {
			System.out.println(imex);
			System.err.println(imex.getMessage());
			
		}
		
		
		

	}

}
