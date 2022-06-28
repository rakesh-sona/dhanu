package Latentview2;

public class Arrayplusstring {
	public static void main(String[] args) {
		String s="rama goes to home";
		String[] x=s.split(" ",2);
		for(String a:x){
			System.out.println(a);
		}
   for(int i=0;i<x.length;i++){
		   System.out.print(x[i]);
	   
		   }
   System.out.println("**************");
   String[] y=s.split(" ");
   for(String a:y){
		System.out.println(a);
	}
   String temp="";
   for(int i=y.length-1;i>=0;i--){
	   temp=temp+" "+y[i];
   }
   System.out.println(temp);
	}
}
