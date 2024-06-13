
public class MultiplesOfN {
	public void multiple(int[] array, int number) {
		for(int num : array) {
			if(num % number == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
