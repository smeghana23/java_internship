import java.util.Scanner;

public class EvenOddSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = scnr.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter array elements");
		for (int counter = 0; counter < size; counter++) {
			array[counter] = scnr.nextInt();
		}
		
		OddEvenArrays oddEven = new OddEvenArrays();
		oddEven.separation(array);

	}

}
