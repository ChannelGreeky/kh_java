package com.kh.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
//		System.out.println(hs);
		ArrayList list = new ArrayList(hs);
		System.out.println("list:"+list);
		System.out.println("hash:"+hs);
		
		Collections.sort(list);
		
		System.out.println("list:"+list);
		System.out.println("hash:"+hs);
		
		//원소 한개한개씩 꺼낼수 있도록
		Iterator iter = hs.iterator();
		
		System.out.println(iter.hasNext());		
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());
	}
}
