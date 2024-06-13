import java.util.Scanner;
public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scnr.nextInt();
		
		Pattern pattern = new Pattern();
		pattern.print(n);

	}

}
