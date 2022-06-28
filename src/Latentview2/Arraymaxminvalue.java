package Latentview2;

import java.util.Arrays;

public class Arraymaxminvalue {

	public static void main(String[] args) {
		int[] ref=new int[5];
		ref[0]=231;
		ref[2]=232;
				ref[3]=233;
				ref[4]=232;
				ref[2]=236;
			//	ref[6]=237;
				System.out.println(ref[2]);
				for(int a: ref){
					System.out.print(a+" ");
				}
				int min=ref[0];
				for(int i=0;i<ref.length;i++){
					if(min>ref[i]){
						min=ref[i];
					}
				}System.out.println("min ="+min);
				int arr[]=Arrays.copyOf(ref, 2);
	//			System.out.println(arr[2]);
			for(int i: arr){
				System.out.println(i);}
				double sum=0,average;
				for(int j:ref){
					sum=sum+ j;
				}
				average=(sum/ref.length);
				System.out.println(average);
			}
	}


