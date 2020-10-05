package com.kh.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		
		System.out.println(hm.get("one"));
		System.out.println(hm.get("two"));
		System.out.println(hm.get("three"));
		System.out.println(hm.get("four"));
		System.out.println(hm);
		
		hm.remove("two");
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey("two"));
		
		Set<String> s = hm.keySet();
		
		System.out.println(s);
		
		Iterator <String> iter = s.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(hm.get(key));
		}
	}
}
