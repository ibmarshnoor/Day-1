package com.ibm.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> accounts=new TreeMap<String, String>();
		accounts.put("-1","accounts1");
		accounts.put("-2","accounts2");
		System.out.println(accounts);
	}

}
