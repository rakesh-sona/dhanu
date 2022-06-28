package Interviewquetion;

public class Aabbccc {
	public static void main(String args[]){  
		String myString = "a1b2c3"; 		 
		int counter = 0; 
		int num = 0; 
		char c = 0; 		 
		for(int i=0;i<myString.length();i++){	 
			if(i%2 != 0){ 
				num = Integer.parseInt(Character.toString(myString.charAt(i))); 
			}else if(i%2 == 0){ 
				c = myString.charAt(i); 
			} 
			counter++;  
			if(counter == 2){ 
				for(int j=0;j<num;j++){ 
					System.out.print(c); 
				} 
				counter = 0; 
			}}}
}
