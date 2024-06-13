
public class Sum {
	public void calcSum (int[] array) {
		int sum = 0;
		if(array[1]%2==0) {
			for(int ele = 0; ele < array.length; ele++) {
				if(ele % 2 == 0) {
					sum+=array[ele];
				}
			}
		}
		else {
			for(int ele = 0; ele < array.length; ele++) {
				if(ele % 2 != 0) {
					sum+=array[ele];
				}
			}
		}
		System.out.println(sum);
	}

}
