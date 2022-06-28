package latentviewpackage;

public class Mutlipleinheritance {

	public static void main(String[] args) {
		C ref=new B();
		ref.met();
		System.out.println(C.d);
		System.out.println(D.f);
	}}
    interface C{
    	int d=34;
    	void met();
    }
    interface D{
    	int f=344;
    }
    class B implements C,D{
    	public void met(){
    		System.out.println("sty");
    	}
    }

