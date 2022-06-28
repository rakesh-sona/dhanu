package latentviewpackage;

public class Singletoneclass1 {
	public static void main(String[] args) {
		Manual s1=Manual.getreturn();
		System.out.println("*****");
		 Manual.getreturn().nem();
		 System.out.println(s1.name);
		 s1.name="tellme";
		 System.out.println(s1.name);
		 Manual s2=Manual.getreturn();
		 System.out.println(s2.name);//as they are now static
		 Manual.getreturn().nem1();
		 s1.nem1();
	}
}
 class Manual{	
		private Manual(){
			System.out.println("constructor");
		}
static Manual s1= new Manual();
String name="topper";
static Manual getreturn(){
	System.out.println("getreturn");
	return s1;
}
static void nem(){
	System.out.println("nem");
}
void nem1(){
	System.out.println("nem1");
}
 }

