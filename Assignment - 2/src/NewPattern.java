import java.util.Scanner;

public class NewPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scnr.nextInt();
		
		Pattern pattern = new Pattern();
		pattern.toFindPattern(num);

	}

}
