
public class PrimeNum {
	int num;
	public void prime(int num) {
		boolean count = true;
		for(int counter = 2; counter < num ; counter++) {
			if(num%counter == 0) {
				count = false;
				System.out.println(count);
				break;
			}
		}
		if(count == true) {
			System.out.println(count);
		}
	}

}
