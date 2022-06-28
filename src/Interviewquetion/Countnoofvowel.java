 package Interviewquetion;

public class Countnoofvowel {
public static void  main(String[] arga){
	String str="GeeksForGeeks";
	int count=0;
	String st= "";
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u' ){
			count++;
			st=str.charAt(i)+st;
		}
	}
	System.out.println("total no. of vowel ="+count);
	System.out.println(st);
}
}
