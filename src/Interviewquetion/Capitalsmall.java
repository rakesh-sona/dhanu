package Interviewquetion;

public class Capitalsmall {

	public static void main(String[] args) {
		String str = "sljOEWJljAO";
		int str1 = 0;
		int str2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				str1++;
			} else {
				str2++;
			}
		}
		System.out.println(str1);
		System.out.println(str2);
	}

}
