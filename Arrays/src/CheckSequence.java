import java.util.Scanner;
public class CheckSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = scnr.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter array elements");
		for(int ele = 0; ele < size; ele++) {
			array[ele] = scnr.nextInt();
		}
		
		Sequence sequence = new Sequence();
		sequence.check(array);

	}

}
