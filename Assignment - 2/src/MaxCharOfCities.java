import java.util.Scanner;

public class MaxCharOfCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String[] city = new String[5];
		
		System.out.println("Enter city names");
		for(int ele = 0; ele < 5; ele++) {
			city[ele] = scnr.next();
		}
		
		MaxCharacters maxChar = new MaxCharacters();
		maxChar.findMax(city);

	}

}
