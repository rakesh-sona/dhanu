package Interviewquetion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Distinctarray {

	public static void main(String[] args) {
		int[] a={34,34,32,56,87987,56};
		Set<Integer> str=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			str.add(a[i]);
		}
     System.out.println(str);
	}

}
