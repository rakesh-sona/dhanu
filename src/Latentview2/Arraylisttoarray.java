package Latentview2;

import java.util.ArrayList;
import java.util.List;

public class Arraylisttoarray {

	public static void main(String[] args) {
		
List<Integer> ref=new ArrayList<Integer>();
ref.add(4);
ref.add(6);
ref.add(75);
ref.add(77);
ref.add(654);
System.out.println(ref);
Object[] ref1=ref.toArray();
//Integer[] ref1=ref.toArray();
System.out.println(ref1);
for(Object i: ref1){
	System.out.println(i);
}

}
}

