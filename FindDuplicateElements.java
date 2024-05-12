package com.siri;

public class FindDuplicateElements {
	public static void main(String[] args) {
		int arr[]= {10,5,10,34,24,90,70,100};
		for(int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
		         System.out.println("Duplicate no of Elements:"+arr[i]);
				}
				
			}
			
		}
	}

}
