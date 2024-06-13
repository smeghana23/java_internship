import java.util.Scanner;
public class Predict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the Temperature:");
		temperature = scnr.nextInt();
		Temperature temp = new Temperature();
		temp.predict(temperature);

	}

}
