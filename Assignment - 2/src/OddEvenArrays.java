import java.util.Arrays;

public class OddEvenArrays {
	int[] array;
	int[] oddArray;
	int[] evenArray;
	int counter1 = 0;
	int counter2 = 0;
	
	public void separation(int[] array) {
		
		oddArray = new int[array.length];
		evenArray = new int[array.length];
		
		for (int counter = 0; counter < array.length; counter++) {
			if (array[counter] % 2 == 0) {
				evenArray[counter1] = array[counter];
				counter1++;
			} else {
				oddArray[counter2] = array[counter];
				counter2++;
			}
		}
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray));
	}

}
