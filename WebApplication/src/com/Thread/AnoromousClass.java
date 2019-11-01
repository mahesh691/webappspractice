package com.Thread;

public class AnoromousClass {
public static void main(String[] args) throws InterruptedException {

Thread t1=new Thread(() -> {
	for(int i=0;i<5;i++) {
		System.out.println("hi");
		try {Thread.sleep(1000);} catch (Exception e) {	}
		}
	});

Thread t2=new Thread(() -> {
	for(int i=0;i<5;i++) {
		System.out.println("hello");
try {Thread.sleep(1000);} catch (Exception e) {}
					}
			});

t1.start();
	try {Thread.sleep(10);} catch (Exception e) {}
t2.start();

}
}
