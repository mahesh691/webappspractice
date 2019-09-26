package com.Array;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IoOperat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*Scanner scan=new Scanner(System.in);//system.in is an input stream
System.out.println("enter your name");
String name=scan.nextLine(); //you can enter multiple words it takes all words
System.out.println("your name is :"+ name);

System.out.println("enter your city");
String city=scan.next(); //you can enter multiple words it takes only one words
System.out.println("your city is :"+ city);

System.out.println("enter your h_no");
int h_no=scan.nextInt(); //you can enter multiple words it takes only one words
System.out.println("your h_no is :"+ h_no);

System.out.println("enter your mobile");
long mobile=scan.nextLong(); 
System.out.println("your mobile is :"+ mobile);

System.out.println("enter your value");
double value=scan.nextDouble(); 
System.out.println("your value is :"+ value);

System.out.println("enter your character");
char character=scan.next().charAt(0); 
System.out.println("your character is :"+ character);

System.out.println("enter your bool");
boolean bool=scan.nextBoolean(); 
System.out.println("your boolean is :"+ bool);*/
//create a folder
	/*File fileobject=new File("C:\\Users\\user\\Desktop\\New folder");	
	fileobject.mkdir();
	boolean a=fileobject.exists();
	if(a==true) {
		System.out.println("file exist");
	}else {
		System.out.println("file not eaxist");
	}*/
	// deleting folder
	
	/*fileobject.delete();*/

//creating a file
		/*File fileobject=new File("C:\\Users\\user\\Desktop\\uft.docx");
			fileobject.createNewFile();
	fileobject.delete();*/
		
//convertig string to integer 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		int a =Integer.parseInt(s1);
		int b =Integer.parseInt(s2);

		System.out.println(a+b);
		scan.close();
		
		
		
		
		
	
	}

}
