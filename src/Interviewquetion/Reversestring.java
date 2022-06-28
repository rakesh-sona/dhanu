package Interviewquetion;

public class Reversestring {

	public static void main(String[] args) {
		String str="iam going to kojbi";
		//String reverse= reverseString(str);
   System.out.println(reverseString(str));
	}
public static String reverseString(String str) {
		if(str.isEmpty()){
			return str;
		}
		return reverseString(str.substring(1))+ str.charAt(0);
	}}

