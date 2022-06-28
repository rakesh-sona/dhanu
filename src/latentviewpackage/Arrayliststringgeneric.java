package latentviewpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arrayliststringgeneric {

	public static void main(String[] args) {
		ArrayList<String> ref=new ArrayList<String>();
		ref.add("strong");
		ref.add("strong5");
		ref.add("strong3");
		ref.add("strong7");
		ref.add("strong5");
		System.out.println(ref);
		ref.removeIf(a-> a.contains("strong5"));//all removed/lambda method
		System.out.println(ref);
		Collections.sort(ref);
		System.out.println(ref);
		Collections.reverse(ref);
		System.out.println(ref);
		Iterator in=ref.iterator();
		while(in.hasNext()){
			System.out.println(in.next());
		}
		ref.forEach(a->{
			System.out.println(a);
		});
	}

}
