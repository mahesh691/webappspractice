package com.Array;

public class Oops_Inheritance {
	
// declare static variable
	static int a=10, b=20;
//declare nonstatic variable
	int c=30, d=40;
//create a static method with returning value
	public static int add() {
		int result =a+b;
		return result;
	}
//create a static method without returning value
		public void multiply() {
			System.out.println(a*b);
		}
//create a non static method with returning value
		public int add2() {
			int res=c+d;
			return res;
		}
//create a non static method without returning value
		public void multiply2() {
			System.out.println(c*d);
		}
	public static void main(String[] args) {
//acccess static class members using by class name
//		int x= Class1.add();
//		System.out.println(x);
//		System.out.println(class.a);
//		class1.multiply();
//acccess non static class members using by object name
//		class obj=new class();
//		int y=obj.add2();
//		System.out.prinln(y);
//		System.out.println(obj.c);
//		obj.multiply2();
		

	}

}
       