package justin.java.exercise;

public class ReverseString {

	public static void main(String[] args) {
		String x = "justin";
		System.out.println(reverseString(x));
	}

	public static String reverseString(String regular) {
		char[] regCharArray = regular.toCharArray();
		char[] revCharArray = new char[regular.length()];
		for (int i = 0; i < regCharArray.length; i++) {
			int regCharIndex = regCharArray.length - 1 - i;
			revCharArray[i] = regCharArray[regCharIndex];
		}
		
		return new String(revCharArray);
	}
}
