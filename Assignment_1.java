package com.acadgild.assignment.arrayList.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
	public static void main(String[] args) {
		
		ArrayList names = new ArrayList();
		
		names.add("Apple");
		names.add("Orange");
		names.add("Grapes");
		names.add("Apple");
		
		Iterator iters = names.iterator();
		while(iters.hasNext()){
			System.out.println(iters.next());
		}
	}
}
