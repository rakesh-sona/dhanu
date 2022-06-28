package Interviewquetion;

public class Preservingpositionreverse {
	 public static void main(String args[]) {
	      String str = "hi welcome to Tutorialspoint";
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      System.out.println(sb);
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){             //char mark
	         sb.insert(i, " ");
	      }
	   }
	   sb.append("");
	   System.out.println(sb);
	}
}
