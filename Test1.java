package com.siri.thread.examples;
class A {
	void m1() {
		System.out.println("m1 entry");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i=" + i);
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		System.out.println("m1 exit");
	}
}
class B {
	void m2() {
		System.out.println("m2 entry");
		for (int i = 6; i <= 10; i++) {
			System.out.println("i=" + i);
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		System.out.println("m2 exit");
	}
}

public class Test1 {
		public static void main(String[] args) {
			long startTime = System.currentTimeMillis();
			System.out.println("main entry");
			A ob1=new A();
			ob1.m1();
			B ob2=new B();
			ob2.m2();
			System.out.println("main exit");
			long endTime = System.currentTimeMillis();
			long totalTime=(endTime-startTime);
			System.out.println("Total Time:"+totalTime);
	}
	

}
