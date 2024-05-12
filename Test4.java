package com.siri.thread.examples;

public class Test4 extends Thread{
	//Thread program execution entry
		@Override
		public void run() {
			Thread currentThread = Thread.currentThread();
//			System.out.println("Name:"+currentThread.getName()+",  Id:"+currentThread.getId()+", Priority:"+currentThread.getPriority());
			for(int i=1;i<=5;i++) {
				System.out.println(currentThread.getName()+" Prints i="+i);
				try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
			}
		}

	public static void main(String[] args) {
		Test4 t1=new Test4();
		Test4 t2=new Test4();
		Test4 t3=new Test4();
		t1.setName("Rohith");
		t2.setName("Gill");
		t3.setName("Kohli");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(9);
		t3.setPriority(8);
//		t3.setPriority(18);//IllegalArgumentException
		t1.start();
		t2.start();
		t3.start();
	}

}
