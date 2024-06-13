
public class Swapping {
	
	public void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Numbers after swapping " + a + " " + b);
	}

}
