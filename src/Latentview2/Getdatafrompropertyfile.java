package Latentview2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Getdatafrompropertyfile {

	public static void main(String[] args) throws IOException {
		String ref=System.getProperty("user.dir")+"\\property\\File.properties";
		try{
			FileInputStream ref1=new FileInputStream(".\\property\\File.properties");
		
		Properties ref3=new Properties();
		ref3.load(ref1);
		System.out.println(ref3.getProperty("name"));
		System.out.println(ref3.getProperty("surname"));}
		catch(Throwable e){
		//e.printStackTrace();
			System.out.println(e);
		}
	}}

