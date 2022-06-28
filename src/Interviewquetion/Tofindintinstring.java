package Interviewquetion;

public class Tofindintinstring {

	public static void main(String[] args) {
		String a="gjsjkhi4675778ng  gf876kgh";
		int digit=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>=48 && a.charAt(i)<=57){
				digit++;
			}
		}
   System.out.println(digit);
	}

}
/*  String string = "The best of both 766987 wo3545rlds";    
	        int count = 0;    
	            for(int i=0;i<string.length();i++){
	            	if(string.charAt(i)>='0' &&  string.charAt(i)<='9'){
	            		count++;
	            	}
	            }
	        //Counts each character except space    
	       
		System.out.println(count);*/