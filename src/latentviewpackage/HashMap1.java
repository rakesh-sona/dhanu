package latentviewpackage;
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> k = new HashMap<Integer,String>();//generic
		k.put(1,"janam");
		k.put(4,"janam4");
		k.put(1,"janam8");
		k.put(2,"janam1");
   System.out.println(k);
   System.out.println(k.size());
   System.out.println(k.get(1));
   System.out.println(k.keySet());
   System.out.println(k.values());
   for(Map.Entry m: k.entrySet()){
	   System.out.println(m.getKey()+" "+m.getValue());
   }
	}
}
