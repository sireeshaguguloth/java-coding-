package com.siri.abstractClass;

public class RbiTest {

	public static void main(String[] args) {
	Rbi bank1= new Sbi();
	bank1.rateOfInterest();
	Rbi bank2=new Hdfc();
	bank2.holidayList();
	bank2.timings();
	bank2.rateOfInterest();
	Rbi bank3=new Icic();
	bank3.holidayList();
	bank3.timings();
	bank3.rateOfInterest();

	}

}
