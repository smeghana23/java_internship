import java.util.Scanner;

public class CalcMultiples {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Enter array elements");
		for(int counter = 0; counter < 10; counter++) {
			array[counter] = scnr.nextInt();
		}
		
		System.out.println("Enter a number");
		int number = scnr.nextInt();
		
		MultiplesOfN multiple = new MultiplesOfN();
		multiple.multiple(array, number);
	}

}
