package com.example.java.collection;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionEx {

	public static void main(String[] args) {

		List countries = new ArrayList();
		countries.add("India");
		countries.add("China");
		countries.add("USA");
		countries.add("Brazil");
		countries.add("India");
		displayAll(countries);

		List lnkLst = new LinkedList();
		lnkLst.add("element1");
		lnkLst.add("element2");
		lnkLst.add("element3");
		lnkLst.add("element4");
		displayListEntries(lnkLst);

		// Hashing the element location for faster access		
		Set hashSet = new HashSet(); 

		hashSet.add("set1");
		hashSet.add("set2");
		hashSet.add("set3");
		hashSet.add("set4");
		displayAll(hashSet);

		SortedSet treeSet = new TreeSet(); // Natural Sorting
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("4");
		displayAll(treeSet);

		LinkedHashSet lnkHashset = new LinkedHashSet();
		lnkHashset.add("one");
		lnkHashset.add("two");
		lnkHashset.add("three");
		lnkHashset.add("four");
		displayAll(lnkHashset);

		Map map1 = new HashMap();
		map1.put("key1", "J");
		map1.put("key2", "K");
		map1.put("key3", "L");
		map1.put("key4", "M");
		displayMapEntries(map1.entrySet());
		displayAll(map1.keySet());
		displayAll(map1.values());

		SortedMap map2 = new TreeMap();
		map2.put("key1", "JJ");
		map2.put("key2", "KK");
		map2.put("key3", "LL");
		map2.put("key4", "MM");
		displayMapEntries(map2.entrySet());
		displayAll(map2.keySet());
		displayAll(map2.values());

		LinkedHashMap map3 = new LinkedHashMap();
		map3.put("key1", "JJJ");
		map3.put("key2", "KKK");
		map3.put("key3", "LLL");
		map3.put("key4", "MMM");
		displayMapEntries(map3.entrySet());
		displayAll(map3.keySet());
		displayAll(map3.values());
	}

	static void displayAll(Collection col) {
		Iterator itr = col.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.print(str + " ");
		}

		System.out.println();
	}

	static void displayListEntries(List list) {
		ListIterator itr = list.listIterator();

		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.print(str + " ");
		}

		System.out.println();
	}

	static void displayMapEntries(Set set) {
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue() + " ");
		}

		System.out.println();
	}
}
