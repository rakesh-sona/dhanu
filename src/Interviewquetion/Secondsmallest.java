package Interviewquetion;

import java.util.Arrays;

public class Secondsmallest {
		public static void main(String[] args){  
			 int array[] = {1,12,11,10, 20, 25, 63, 96, 57};
		      Arrays.sort(array);
		      for(int i=0;i<array.length;i++){
		    	  System.out.print(array[i]+" ");
		      }
		  //    System.out.println("sorted Array ::"+Arrays.toString(array));       
		      int res = array[1];
		      System.out.println("2nd smallest element is ::"+res);
		}}

