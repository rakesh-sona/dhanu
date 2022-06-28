package latentviewpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapHash {
      public static void main(String[] args){
    	  Map<String,String> j=new HashMap<String,String>();
    	  j.put("ram","bhagwan");
    	  j.put("ram4","bhagwan2");
    	  j.put("ram3","bhagwa4n");
    	  j.put("ram5","bhagwan3");
    	  System.out.println(j);
    	  System.out.println(j.size());
    	  System.out.println(j.keySet());
    	  System.out.println(j.values());
    	  System.out.println(j.get("ram"));
    	 for(Map.Entry m: j.entrySet()){
    		  System.out.println(m.getKey()+"  "+m.getValue());//it works when generic is given
    	  }
    	
      }
}