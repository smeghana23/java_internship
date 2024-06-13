import java.util.Scanner;
public class LargestOf10Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num,large;
		System.out.println("Enter a num");
		num = scnr.nextInt();
		large = num;
		for(int counter = 2; counter<=10; counter++) {
			System.out.println("Enter the next num");
			num=scnr.nextInt();
			if(num > large) {
				large=num;
			}
		}
		System.out.println("Largest no:" +large);

	}

}
