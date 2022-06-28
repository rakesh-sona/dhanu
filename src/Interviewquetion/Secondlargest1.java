package Interviewquetion;

import java.util.Arrays;

public class Secondlargest1 {
		   public static void main(String args[]){
		      int array[] = {1,12,11,10, 20, 25, 63, 96, 57};
		      Arrays.sort(array);
		      for(int i=0;i<array.length;i++){
		    	  System.out.print(array[i]+" ");
		      }
		  //    System.out.println("sorted Array ::"+Arrays.toString(array));       
		      int res = array[array.length-2];
		      System.out.println("2nd largest element is ::"+res);
		   }
}
