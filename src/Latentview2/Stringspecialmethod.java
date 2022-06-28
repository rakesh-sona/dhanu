package Latentview2;

public class Stringspecialmethod {

	public static void main(String[] args) {
		String s="ram*123^%&&(^%$tknkjh(*";
		System.out.println(s.replaceAll("[^A-Za-z0-9]",""));
		System.out.println(s.replaceAll("[A-Za-z0-9]",""));
		System.out.println(s.replaceAll("\\W",""));
		String r="44frtry56h.56g";
		System.out.println(r.replaceAll("\\d", ""));
		System.out.println(r.replaceAll("\\.",""));
		String i="5279.7789675";
		System.out.println(i.replaceAll("\\.\\d+$",""));//not work for this(String i="5279.778967fd5")
		StringBuffer sef=new StringBuffer("bangluru");
		System.out.println(sef.reverse());
	}
}
