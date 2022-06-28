package latentviewpackage;

public class Immutableclass {
public static void main(String []args){
	Opack ref=new Opack(10,30);
	ref.getb();
	System.out.println(	ref.getb());
	System.out.println(ref.B+" "+ref.C);
}
}
final class Opack{
	final int B;
	final int C;
	public Opack(int a,int d){
		B=a;
	    C=d;
	}
	public int getb(){
		return B+C;
	}
}