
public class Average {
	public void evenIndexEleAvg(int[] array) {
		int average = 0, sum = 0;
		for(int ind = 0; ind < array.length; ind++) {
			if(ind % 2==0) {
				sum += array[ind];
			}
		}
		average = sum / array.length;
		System.out.println(average);
	}
}
