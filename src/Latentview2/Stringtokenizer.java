package Latentview2;

import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		StringTokenizer str=new StringTokenizer("rej-sem-nem");
		while(str.hasMoreTokens()){
			System.out.println(str.nextToken("-"));
		}

	}

}
