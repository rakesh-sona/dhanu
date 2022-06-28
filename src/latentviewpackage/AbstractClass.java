package latentviewpackage;

public class AbstractClass {
public static void main(String[] arr){
	
}
}
abstract class orange{
	abstract String method(String j);
	abstract void mthod1();
}
class Java extends orange{
	public void mthod1(){
		System.out.println("java");
	}
	public String method(String j){
		j="star";
		return j;
	}
	
}