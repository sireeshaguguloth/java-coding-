package com.siri.abstractClass;
interface myInterface{
	void method1();
}


public class Test1 {

	public static void main(String[] args) {
		myInterface ob=new myInterface() {
			
			public void method1() {
				System.out.println("logic");
			}
		
		};
       ob.method1();
       System.out.println(ob.getClass());
	}

}
