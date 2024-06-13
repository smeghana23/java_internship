
public class MaxCharacters {
	public void findMax(String[] array) {
		int max = 0;
		for(String ele : array) {
			if (max < ele.length()) {
				max = ele.length();
			}
		}
		for(String ele : array) {
			if(ele.length() == max) {
				System.out.println(ele);
			}
		}
		
	}

}
