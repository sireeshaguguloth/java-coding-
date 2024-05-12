package com.siri.thread.examples;
//Thread can be prepared in 2 ways:
//1.Using Thread class
//2.Using Runnable interface  (Below Program)
class Class1 implements Runnable {
	void m1() {
		System.out.println("m1 entry");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i=" + i);
			try {Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}//IV.Non-Runnable State
		}
		System.out.println("m1 exit");
	}
	@Override
	public void run() {   //(III.Running State)
		m1();
	}
}
class Class2 implements Runnable {
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
public class Test3 {

	public static void main(String[] args) {
		Class1 ob1=new Class1();	
		Thread t1=new Thread(ob1);//Created a Thread-0 object (I.New State)
		t1.start();		//start() will calls the run()  (II.Runnable State)
		//V.Dead/Destroy State
		Class2 ob2=new Class2();	
		Thread t2=new Thread(ob2);//Created a Thread-1 object
		t2.start();		//start() will calls the run()

	}

}
