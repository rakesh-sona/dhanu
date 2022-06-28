package Interviewquetion;
public class Reapitingcharfirst {
	public static void main(String[] args) {
		Reapitingcharfirst ref=new Reapitingcharfirst();
		System.out.println(ref.findFirstRepeating("Ramgopal warma"));
		  }
	char findFirstRepeating(String str) {
	    str = str.toLowerCase(); // to avoid any case sensitive issue
	    for (int i = 0; i < str.length(); i++) {
	      if (str.lastIndexOf(str.charAt(i)) > i) {
	        return str.charAt(i);
	      }
	    }
	    return 0; // 0 or null if no char is repeating
	  }
	}


