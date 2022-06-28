package Interviewquetion;

public class Sumofdigit {
	    public static void main(String[] args) {
	        String str="4PREP2INSTAA6";
	        int sum=0;
	        int count=0;
	        for(int i=0;i<str.length();i++){            
	          if(str.charAt(i)>='0' &&  str.charAt(i)<='9'){
	                sum+=(str.charAt(i)-'0');
	                count++;
	            }
	        }
	        System.out.println("Sum of all digits  " +sum );
	        System.out.println(count);
	    }
}
//sum of no.