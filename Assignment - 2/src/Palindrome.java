
public class Palindrome {
	
	public void reverse(String string) {
		String revString = "";
		for(int counter = 0; counter < string.length(); counter++) {
			//for(int counter = str.length() - 1; counter <= 0; counter--)
			char ch = string.charAt(counter);
			revString = ch + revString;
		}
		if(string.equals(revString)) {
			System.out.println("Given string is a palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
		
	}
	

}
