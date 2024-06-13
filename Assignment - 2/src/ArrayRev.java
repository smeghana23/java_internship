import java.util.Arrays;

public class ArrayRev {
	
	int[] newArray;
	public void toRev(int[] array) {
		int length = array.length;
		newArray = new int[length];
		for (int counter = length - 1; counter >= 0; counter--) {
			newArray[(length -1) - counter] = array[counter];
		}
		for (int ele : newArray) {
			System.out.println(ele);
		}
		System.out.println(Arrays.toString(newArray));
	}

}
