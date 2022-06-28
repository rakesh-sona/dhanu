package latentviewpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistgeneric {

	public static void main(String[] args) {
ArrayList<Integer> ref=new ArrayList<Integer>();
ref.add(54);
ref.add(954);
ref.add(574);
ref.add(546);
ref.add(54);
//ref.add(null);
System.out.println(ref);
System.out.println(ref.get(3));
Iterator i=ref.iterator();
//ref.removeIf(a->( a.contains(54)));
System.out.println(i.next());
Collections.sort(ref);
System.out.println(ref);
Collections.reverse(ref);
System.out.println(ref);
ArrayList<Integer> ref1=new ArrayList<Integer>();
ref1.add(334);
ref1.add(54);
ref.addAll(ref1);
System.out.println(ref);
System.out.println(ref1);
System.out.println(ref.retainAll(ref1)+"***");
System.out.println(ref+" "+ref1);
System.out.println(ref.removeAll(ref1)+"***");
System.out.println(ref+" "+ref1);

}

}
