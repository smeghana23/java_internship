import java.util.Scanner;
public class CalcSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scnr.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the array elements");
		for(int ele = 0; ele < array.length; ele++) {
			array[ele] = scnr.nextInt();
		}
		
		SumOfElements sumOfElements = new SumOfElements();
		sumOfElements.sum(array);
	}
}
