import java.util.Scanner;

public class VowelFinder {
	
	public String readString() {
		Scanner scnr = new Scanner(System.in);
		String string = scnr.nextLine();
		return string;
	}
	
	public int vowelsInString() {
		String string = readString();
		int count = 0;
		for(int counter = 0; counter < string.length(); counter++) {
			char vowel = string.charAt(counter);
			if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'
					|| vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
				count++;
			}
		}
		return count;
	}
	
	public void vowelsCount() {
		int count = vowelsInString();
		System.out.println("Number of vowels in string : " + count);
	}

}
