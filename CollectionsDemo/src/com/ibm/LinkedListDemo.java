package com.ibm;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> names=new LinkedList<String>();
		
		//names.add("Ram");
		for (int i = 0; i < 500; i++) {
			names.add("Ram"+i);
		}
		names.sort(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int value2=Integer.valueOf(o2.substring(3));
				int value1=Integer.valueOf(o1.substring(3));
				return value2-value1;
			}
		});
		System.out.println(names);
	}

}
