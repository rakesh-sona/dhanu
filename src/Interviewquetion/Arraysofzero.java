package Interviewquetion;

public class Arraysofzero {

	public static void main(String[] args) {
		int arr[]={1,0,1,0,0,1,1};//{3,4,5,0,7,0,80,0,6};
		int arrr[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arrr[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arrr.length;i++){
			System.out.print(arrr[i]+" ");
		}
	}
}
