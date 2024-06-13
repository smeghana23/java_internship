
public class Sequence {
	public void check(int[] array) {
		int flag = 0;
		for(int ele = 0; ele < array.length; ele++) {
			if(array[ele] == 1 && array[ele+1] == 2 && array[ele+2] == 3) {
				System.out.println(true);
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.err.println(false);
		}
	}

}
