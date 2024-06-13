import java.util.Scanner;
public class CalcAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = scnr.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the elements of the array");
		for(int ele = 0; ele < size; ele++) {
			array[ele]=scnr.nextInt();
		}
		
		Average average = new Average();
		average.evenIndexEleAvg(array);
	}

}
