import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num,count = 0,rem;
		System.out.println("Enter a integer:");
		num = scnr.nextInt();
		if(num==0) {
			count++;
		}
		while(num!=0) {
			rem = num%10;
			count++;
			num = num/10;
		}
		System.out.println("Number of digits:" +count);
	}

}

//do while : the purpose of do while loop to repeat atleast for once.
//The info about the application to perform various operations can be provided within do while loop.
//if the user wants to continue the application anyone of the options can be selected otherwise the options window can be exited.
//example:a menu driven application