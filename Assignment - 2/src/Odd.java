
public class Odd {
	
	public void checkNum(int number) {
		boolean count = true;
		while (number != 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				count = false;
			}
			number = number / 10;
		}
		if (count == true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
}
