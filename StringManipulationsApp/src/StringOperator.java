
public class StringOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Life is beautiful";//string iteral
		String str2 = new String("Life is beautiful");//string object
		System.out.println(str.length());//length of string
		char ch = str.charAt(1);//to find a char at a index in string
		System.out.println(ch);
		String substr = str.substring(5,7);//to find a substring in the string
		System.out.println(substr);
		String concatStr = str.concat(", folks");
		System.out.println(concatStr);//to concat the two strings
		
		
		//finding no of spaces
		int counter = 0;
		for(int index = 0; index < str.length(); index++) {
			char space = str.charAt(index);
			if(space==' ') {
				counter++;
			}
		}
		System.out.println("number of spaces:"+counter);

	}

}
