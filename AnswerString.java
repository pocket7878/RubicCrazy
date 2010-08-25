public class AnswerString {
	public static String Reverse(String str) {
		String ret = "";
		int length = str.length();
		for(int i = length - 1; i >= 0; i--) {
			ret += str.charAt(i);
		}

		return ret;
	}
}
