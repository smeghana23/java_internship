
public class SumOfElements {
	public static void main(String[] args) {
		float[] prices = { 564.98f, 789.78f, 890.89f, 986.98f, 906.98f ,897.93f};//this is called intializer list. list of intialized array elements.
		System.out.println(prices.length);//length method is instance constant.
		float sum = 0.0f;
		for(int index = 0; index < prices.length; sum += prices[index], index++); {
			//sum += prices[ index ];
		}
		System.out.println("The original array: ");
		for(int index = 0; index < prices.length; index++) {
			System.out.println(prices[index]);
		}
		for(float price : prices) {
			System.out.println(price);
		}
		System.out.println("sum of array elements: "+sum);
		for(;;) {
			System.out.println("Hi");
		}
	}
}
//without a condition returns true the control will not going to body of the loop
//the maximum value of the int datatype is the size of the array.