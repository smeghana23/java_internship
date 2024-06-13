
public class Pattern {
	public void print(int n) {
		for(int counter = 1; counter <= n; counter++) {
			for(int spaces = 1; spaces <= n - counter; spaces++) {
				System.out.print(" ");
			}
			for(int counter1 = 1; counter1 <= counter; counter1++) {
				System.out.print(counter);
			}
			System.out.println();
		}
	}

}
