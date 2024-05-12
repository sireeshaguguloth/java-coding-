package com.siri.exception;

public class Test1 {

	public static void main(String[] args) {
		try {
		int a,b,c;
	        a=10;
	        b=0;
	        c=a/b;
	      System.out.println(c);
		}catch(Exception ae) {
			System.out.println("canot divede bt zero");
	 }
		finally {
			System.out.println("end");
		}
		
		
		
		
		
	}

}
