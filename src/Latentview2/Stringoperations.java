package Latentview2;

public class Stringoperations {

	public static void main(String[] args) {
		String s="ram is going to london";
		String[] sb=s.split(" ");
		System.out.println(s.charAt(2));
		System.out.println(sb[0]);   
		System.out.println(s.toUpperCase());
		System.out.println(s.replaceAll("\\s",""));
		String temp="";
		for(int i=sb.length-1;i>=0;i--){
			temp=temp+" "+sb[i];
			
		}
		System.out.println(temp);
		String res="";
		for(int i=0;i<sb.length;i++){
			res=res+" "+sb[i].substring(0,1).toUpperCase()+sb[i].substring(1).toLowerCase();
		}
		System.out.println(res);
		String res1="";
		for(int i=0;i<sb.length;i++){
			res1=res1+" "+sb[i].substring(0,1).toLowerCase()+sb[i].substring(1).toUpperCase();
		}
		System.out.println(res1);
		System.out.println(sb[0].substring(0,1));
	}

}
