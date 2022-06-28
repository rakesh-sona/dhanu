package latentviewpackage;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
public class Treeset1 {
	public static void main(String[] args) {
	ArrayList<String> str= new ArrayList<String>();
	str.add("A");
	str.add("B");
	str.add("C");
	str.add("E");
	str.add("C");
  System.out.println(str);
  TreeSet<String> ram= new TreeSet<String>(str);
  System.out.println(ram);
  System.out.println(ram.size());
ram.descendingSet();//this methods are for only treeset
System.out.println(ram);
System.out.println(ram.descendingSet());
  System.out.println(ram.headSet("C"));
  System.out.println(ram.headSet("B",true));
  System.out.println(ram.hashCode());
  System.out.println(ram.subSet("A","E"));
  System.out.println(ram.tailSet("C",false));
  Collections.reverse(str);
  System.out.println(str);
  	}
}
