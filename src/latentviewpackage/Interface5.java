package latentviewpackage;

public class Interface5 implements A{
	public double method3(int a){
		return a;
	}
	static void method(){
		System.out.println("RAM RAM");
	}
	public void method1(){
		System.out.println("java 8 facilate icrease visibility");
	}
  public static void main(String[] args){
	  A.method();
	 
	 A ar=new Interface5(); // we cant creat obj of interface
	 ar.method1();
System.out.println(ar.method3(4));
	 Interface5.method();
  }
}
interface A{
	int b=100;
	static void method(){
		System.out.println("ram sham");
	}
	double method3(int a);
	default void method1(){
		System.out.println("java 8 facilate");
	}
}