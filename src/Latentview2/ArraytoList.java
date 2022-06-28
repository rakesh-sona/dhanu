package Latentview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		String[] ref={"vasudev","jfh","fdh","lhdf"};
		System.out.println(ref);
		for(String s: ref){
			System.out.println(s);
		}
		System.out.println(ref);
		 //List ref1=Arrays.asList(ref);
      ArrayList ref1=(ArrayList) Arrays.asList(ref);
      System.out.println(ref1);
    //  ref1.add("jdjo");
    //  ref[4]="jjg";
    // System.out.println(ref1);
	}

}
