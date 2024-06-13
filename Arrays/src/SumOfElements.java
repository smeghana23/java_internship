
public class SumOfElements {
	
	public void sum(int[] array) {
		int sum = 0;
		int size = array.length;
		sum = array[0] + array[size - 1] + array[size/2] + array[size/2 -1 ] + array[size/2 + 2];
		System.out.println(sum);
	}

}
