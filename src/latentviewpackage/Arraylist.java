package latentviewpackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Arraylist {
	public static void main(String[] args) {
		  ArrayList list=new ArrayList();
		  System.out.println(list.size());
		  System.out.println(list);
		 list.add("str");
		  list.add(48);
		  list.add('a');
		  System.out.println(list.add(54)+"*****");
		  System.out.println(list.size());
		  System.out.println(list);
		  System.out.println(list.get(2));
		  Collections.reverse(list);
		  System.out.println(list);
		  System.out.println(list.remove("str")+"************");
		  Arraylist abc=new Arraylist();
		  System.out.println(abc);
		  list.add(1,abc);
		  System.out.println(list);
		  list.set(1, "wrong");
		  for(int i=0;i<list.size();i++){
			  System.out.println(list.get(i));
		  }
		  for(Object l: list){
			  System.out.println(l);
		  }
		  Iterator i=list.iterator();
		//  list.removeIf(a->(a.contains("wrong")));use in string generic type
		  System.out.println(list.remove("wrong"));
		//  Collections.sort(list);//simillar type of data type Arrays.sort(arr)
		  System.out.println(list.size());
		  System.out.println(list);
			}}


