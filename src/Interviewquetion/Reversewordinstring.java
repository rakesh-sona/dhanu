package Interviewquetion;

public class Reversewordinstring {
public static void main(String[] args){
String str="raj Yog";
  String words[]=str.split(" ");  //str.split("\\s")
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord=reverseWord+" "+sb.toString();  
    }  
   System.out.println(reverseWord);  
}
}
