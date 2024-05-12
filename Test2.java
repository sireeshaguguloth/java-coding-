package com.siri.thread.examples;
//Thread can be prepared in 2 ways:
//1.Using Thread class (Below Program)
//2.Using Runnable interface
class C1 extends Thread {
	void m1() {
		System.out.println("m1 entry");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i=" + i);
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		System.out.println("m1 exit");
	}
	@Override
	public void run() {
		m1();
	}
}
class C2 extends Thread {
	void m2() {
		System.out.println("m2 entry");
		for (int i = 6; i <= 10; i++) {
			System.out.println("i=" + i);
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
		}
		System.out.println("m2 exit");
	}
	@Override
	public void run() {
		m2();
	}
}

public class Test2 {

	public static void main(String[] args) {
		C1 ob1=new C1();	//Created a Thread-0
		ob1.start();		//start() will calls the run()
		C2 ob2=new C2();	//Created a Thread-1
		ob2.start();		//start() will calls the run()

	}

}
