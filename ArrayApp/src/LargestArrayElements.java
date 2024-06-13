import java.util.Scanner;
public class LargestArrayElements {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//declare the array
		float marks[] = new float[5];
		for(float mark : marks) {
			System.out.println(mark);
		}
		//read values into array
		for(int index = 0; index < marks.length; index++) {
			System.out.println("Enter mark for index "+index);
			marks[index] = scnr.nextFloat();
		}
		float large = marks[0];
		for(int index = 1; index < marks.length; index++) {
			if(large<marks[index]) {
				large = marks[index];
			}
		}
		System.out.println("largest value of marks: "+large);
		
	}

}
