package latentviewpackage;

public class Stringpractice {
	public static void main(String[] args) {
		String sq= "my name is ravam";
		System.out.println(sq.charAt(8));
		System.out.println(sq.length());
	//	System.out.println(sq.reverse());
     //  System.out.println(reverseString("ram nam"));
		System.out.println(sq.toString());
		System.out.println(sq.substring(1,6));
		System.out.println(sq.indexOf("name"));
		System.out.println(sq.lastIndexOf('m',5));//first 5 index,last m
		System.out.println(sq.indexOf('a',3));//from 3rd index,first a
		String s=new String("ranj");
		String d=s.concat(sq);
		System.out.println(d);
		System.out.println(s.equals(sq));//value
		System.out.println(s==sq);//address
		String se="raj";
		String a=new String("rame");
		String de=a;
		System.out.println(de.equals(a));
		System.out.println(de==a);
		String dz=new String(se);
		System.out.println(dz==se);
		System.out.println(sq.substring(4));
	}
}
