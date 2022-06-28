package latentviewpackage;
import java.util.Collections;
import java.util.Vector;
public class Vectormethod {
	

		public static void main(String[] args) {
			Vector vec= new Vector();
	vec.addElement("trop");
	vec.addElement("trop1");
	vec.addElement("trop2");
	vec.addElement("trop3");
	vec.add(1,"45");//we can also add different datatype
	System.out.println(vec.get(2)+"*****");
	System.out.println(vec.size());
	System.out.println(vec);
	System.out.println(vec.capacity());
	Collections.reverse(vec);
	System.out.println(vec);
	for(int i=0;i<vec.size();i++){
		System.out.println(vec.get(i));
	}
	System.out.println(vec.remove("trop")+"******");
	Collections.sort(vec);
	System.out.println(vec);
		}
}
