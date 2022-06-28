package Latentview2;

public class Practicemakesmanperfect {

	public static void main(String[] args) {
   String ref= "jklj tiou oiu";
  System.out.println(ref.charAt(3));
  System.out.println(ref.replace('o', 'r'));
  System.out.println(ref.replaceAll("jk", "sdah"));
  String temp="";
  for(int i=ref.length()-1;i>=0;i--){
	  temp=temp+ref.charAt(i);
  }
  System.out.println(temp);
  String rf[]=ref.split(" ");
  for(String i:rf){
	  System.out.println(i);
  }
  System.out.println(rf.length);
  String temp2="";
  for(int i=rf.length-1;i>=0;i--){
	 temp2=temp2+" "+rf[i];
  }
  System.out.println(temp2);
	}

}

