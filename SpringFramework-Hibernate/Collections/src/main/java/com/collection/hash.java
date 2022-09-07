package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hash {

	public static void main(String[] args) {
	
		HashSet<String> hs=new HashSet<String>();
		hs.add("krishna");
		hs.add("hari");
		hs.add(null);
		
		hs.add("krishna");
		
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.addAll(hs);
		System.out.println("----");
		Iterator<String> i=hs1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
