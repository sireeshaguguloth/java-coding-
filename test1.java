package com.siri.collecotions.list.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
 public static void main(String[] args) {
	List<Integer> list1= new ArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	List<Integer> list2= Arrays.asList(40,50,60);
	list1.addAll(list2);
	System.out.println(list1.size());
	System.out.println(list1.isEmpty());
	System.out.println(list1.equals(list2));
	System.out.println(list1.hashCode());
	System.out.println(list1.contains(30));
	System.out.println(list2.contains(30));
	System.out.println(list1.containsAll(list2));
	List<Integer>list3 = Arrays.asList(90,100,110);
	list1.addAll(list3);

}
}
