package latentviewpackage;

public class Inheritance {
	static int c=89;
  public void neme(){
	  System.out.println("fjijhi");
  }
	public static void main(String[] args) {
		Inheritance ref=new Rames();
		ref.neme();
		Rames ref1=(Rames)ref;//downcasting  new Rames()
		ref1.name();
		ref.neme();
		System.out.println(Rames.b);
		System.out.println(c);
	}
}
   class Rameshwaram extends Inheritance{
	   void math(){
		   System.out.println("go to the bed");
	   }
   }
   class Rames extends Rameshwaram{
	   static double b=49;
	   public void name(){
		   System.out.println("ramkjfjhfkj");
	   }
	   public void neme(){
		   System.out.println("sii");
   }}