import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=scnr.nextInt();
		for(int counter=1;counter<=num;counter++) {
			for(int counter1=1;counter1<=counter;counter1++) {
				System.out.print(counter);
			}
			System.out.println();
		}
	}

}