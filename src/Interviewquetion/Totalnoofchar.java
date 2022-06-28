package Interviewquetion;

public class Totalnoofchar {
	public static void main(String[] args) {    
        String string = "The best of both 7987 wo3545rlds";    
        int count = 0;    
            
       //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) !=' '){    
                count++;    
        }   } 
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }
}
/*
for(int i = 0; i < string.length(); i++) {    
    if(string.charAt(i)>= 'A' && string.charAt(i)<='z'){    
        count++;    
}   } 
	
//Displays the total number of characters present in the given string    not no.
System.out.println("Total number of characters in a string: " + count);}}    */
