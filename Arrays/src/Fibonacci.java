
public class Fibonacci {
	int[] array = new int[10];
	public void fib() {
		int num1 = 0;
		int num2 = 1;
		array[0] = 0;
		array[1] = 1;
		for(int ind = 2; ind < 10; ind++) {
			int num3 = num1 + num2;
			array[ind] = num3;
			num1 = num2;
			num2 = num3;
		}
		for(int ele : array) {
			System.out.println(ele);
		}
	}

}
