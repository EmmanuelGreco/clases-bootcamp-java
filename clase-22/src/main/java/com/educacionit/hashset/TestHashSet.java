package com.educacionit.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {		
		Set<Integer> hashSet = new HashSet<>();
		
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(30);
		System.out.println(hashSet);
		
		for (Integer unData : hashSet) {
			System.out.println(unData);
		}
		
		Set<Integer> hash2 = new HashSet<>();
		hash2.add(1);
		hash2.add(30);
		hash2.add(20);
		
		hashSet.addAll(hash2);
		System.out.println(hashSet);
		
		if (hashSet.contains(10)) {
			System.out.println("Mi coleccion principal contiene un valor 10.");
		}
		
		Integer [] array = new Integer[hashSet.size()];
		array = hashSet.toArray(array);
		
		System.out.println(Arrays.toString(array));
		
		hashSet.removeAll(hash2);
		System.out.println(hashSet);
		
		for (Iterator<Integer> iterator = hash2.iterator(); iterator.hasNext();) {
			@SuppressWarnings("unused")
			Integer integer = (Integer) iterator.next();
		}			
	}
}
