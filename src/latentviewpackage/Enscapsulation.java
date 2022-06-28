package latentviewpackage;

public class Enscapsulation {

	public static void main(String[] args) {
		Fam ref=new Fam();
		 System.out.println(ref.getx());
	        System.out.println(ref.gety());
		ref.setx(33);
        ref.setz(54);
        System.out.println(ref.getx());
        System.out.println(ref.gety());
	}
}
class Fam{
	private int x;
	private double y;
	public int getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public void setx(int x){
		this.x=x;
		
	}
	public void setz(double y){
		this.y=y;
		
	}
}