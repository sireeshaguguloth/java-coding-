package com.siri.thread.examples;

public class Test5 extends Thread {
	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		System.out.println("Before join(), "+ct.getName()+" status is:"+ct.isAlive()); //Tests if this thread is alive
		for(int i=1;i<=5;i++) {
			System.out.println(ct.getName()+" Prints i="+i);
			try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
		}
	}
	public static void main(String[] args) throws InterruptedException {    
		Test5 t1=new Test5();
		Test5 t2=new Test5();
		t1.setName("Rohith");
		t2.setName("Gill");
		t1.start();
		t1.join(); //Waits for this thread to die.
		t2.start();
		t2.join(); //Waits for this thread to die.
		
		System.out.println("After join(), "+t1.getName()+" status is:"+t1.isAlive());
		System.out.println("After join(), "+t2.getName()+" status is:"+t2.isAlive());
	}
}
