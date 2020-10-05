package com.kh.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		
		hm.put(1, new Student(1,"È«±æµ¿",20,"°æ±âµµ"));
		hm.put(2, new Student(2,"±è¸»¶Ë",30,"¼­¿ï½Ã"));
		hm.put(3, new Student(3,"°í±æ¶Ë",50,"ºÎ»ê½Ã"));
		
		Set<Integer> s = hm.keySet();
		
		Iterator<Integer> iter = s.iterator();
		
		while(iter.hasNext()) {
			System.out.println(hm.get(iter.next()));
		}
	}
}
