package Interviewquetion;

import java.util.Arrays;

public class Checkarrayequal {
public static void main(String[] args){
	int[] a={23,23,44,54};
	int b[]={23,23,44,54};
	boolean result=Arrays.equals(a,b);
	if(result==true){
		System.out.println("array are equal");
	}else{
		System.out.println("array are differnt");
	}
}
}
