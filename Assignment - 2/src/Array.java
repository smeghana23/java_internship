import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int size;  
		
		System.out.println("Enter the size of the array");
		size = scnr.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter array elements");
		for (int counter = 0; counter < size; counter++) {
			array[counter] = scnr.nextInt();
		}
		
		ArrayRev array1 = new ArrayRev();
		array1.toRev(array);
	}

}
