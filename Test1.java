package com.siri.inheritance.introduction;
class ClassOne{
	protected void m1() {
		System.out.println("business logic1");
	}
}
	
class ClassTwo extends ClassOne{
	protected void m2() {
		System.out.println("business logic2");
	}
}
class ClassThree extends ClassTwo{
	protected void m3() {
		System.out.println("business logic3");
	}
}
class ClassFour extends ClassTwo{
	protected void m4() {
		System.out.println("business logic4");
	}
}


public class Test1 {

	public static void main(String[] args) {
	ClassOne ob1=new ClassOne();
	ob1.m1();
	ClassTwo ob2=new ClassTwo();
	ob2.m2();
	ClassThree ob3=new ClassThree();
	ob3.m3();
	ClassFour ob4=new ClassFour();
	ob4.m4();
	
	}

}
