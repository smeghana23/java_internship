import java.util.Scanner;
public class CalculateCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		double salesAmount;
		System.out.println("Enter Amount:");
		salesAmount = scnr.nextDouble();
		Commission calculation = new Commission();
		calculation.calculate(salesAmount);

	}

}
