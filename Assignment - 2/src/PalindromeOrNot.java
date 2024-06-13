import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String string;
		Palindrome palindrome = new Palindrome();
		string = scnr.next();
		palindrome.reverse(string);

	}

}

