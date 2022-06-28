package Interviewquetion;
import java.util.Scanner;
public class Daydateconversion {
	    public static void main(String args[])
	    {
	        int m, year, week, day,month;
	        Scanner s = new Scanner(System.in);//assume 30days in month
	        System.out.print("Enter the number of days:");
	        m = s.nextInt();
	        year = m / 360;
	        m = m % 360;
	        System.out.println("No. of years:"+year);
	        month = m / 30;
	        m = m % 30;
	        System.out.println("No. of month:"+month);
	        week = m / 7;
	        m = m % 7;
	        System.out.println("No. of weeks:"+week);
	        day = m;
	        System.out.println("No. of days:"+day); 
	    }
	}


