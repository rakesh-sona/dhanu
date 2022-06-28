package latentviewpackage;

public class Interface1 {

	public static void main(String[] args) {
		
Velocity ref= new Velocity();
ref.method2();
	}

}
interface Raj{
	abstract void method2();
}
class Velocity implements Raj{
	public void method2(){
		System.out.println("ram ram");
	}
	Velocity(){
		System.out.println("lkjoj");
	}
}