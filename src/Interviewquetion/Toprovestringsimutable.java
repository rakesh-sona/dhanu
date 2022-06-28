package Interviewquetion;

public class Toprovestringsimutable {
	 public static void main(String[] args){
	        String s1 = "JAVA";
	        String s2 = "JAVA";
	        System.out.println(s1 == s2);         //Output : true on address base
	        s1 = s1 + "J2EE";
	   System.out.println(s1);
	        System.out.println(s1 == s2);         //Output : false
	    }
}
