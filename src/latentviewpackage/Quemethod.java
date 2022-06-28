package latentviewpackage;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Quemethod {
			public static void main(String[] args) {
				Queue<Integer> que= new PriorityQueue<Integer>();
				que.add(2);
				que.add(0);
				que.add(1);
				que.add(26);
				que.add(24);
			//	System.out.println(que.capacity());
				System.out.println(que);
				System.out.println(que.size());
				System.out.println(que.element());//throw nosuchelementexception
				System.out.println(que.peek());
	 //System.out.println(que.get(1));
		//que.removeIf(a-> a.contains(2));
		//  Collections.sort(que);
		  System.out.println("*************");
		  System.out.println(que.poll());
		  System.out.println(que.remove());//throw nosuchelementexception
		  System.out.println("***");
		  Iterator in=que.iterator();
		  while(in.hasNext()){
			  System.out.println(in.next());
			  }
		  System.out.println("***");

		  
			  que.forEach(obj ->{
				  System.out.println(obj);
			  });
		//	  for(int i=0;i<que.size();i++){
			//	  System.out.println(que.get(i));
			  //}
			}}
			
