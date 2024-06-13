
public class Pattern {
	
	public void toFindPattern(int n) {
		for (int counter = n; counter >= n / 2; counter--) {
			for (int counter1 = 1; counter1 <= counter; counter1++) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
		for (int counter = n / 2 + 1; counter <= n; counter++) {
			for (int counter1 = 1; counter1 <= counter; counter1++) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
	}

}

