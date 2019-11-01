package com.Thread;


class hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hi");
			try {Thread.sleep(1000);} catch (Exception e) {	}
		}
	}
}

class hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");
try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}


public class MyThread {
public static void main(String[] args) throws InterruptedException {

hi obj1=new hi();
hello obl2=new hello();

obj1.start();
try {Thread.sleep(10);} catch (Exception e) {}
obl2.start();

}
}
