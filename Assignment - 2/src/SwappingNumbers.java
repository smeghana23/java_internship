import java.util.Scanner;
public class SwappingNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter two integers");
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		
		Swapping num = new Swapping();
		num.swap(a, b);
		
	}

}
