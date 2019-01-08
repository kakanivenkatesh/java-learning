package com.sample.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList <>();
		list.add("Corridor");
		list.add("WM");
		list.add("SpotCues");
		list.add("RaveMarketing");
		list.add("LSUC");
		list.add("Corridor");
		
		System.out.println("List of Projects :"+ list);
		
		//TreeSet
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Corridor");
		treeSet.add("WM");
		treeSet.add("SpotCues");
		treeSet.add("RaveMarketing");
		treeSet.add("LSUC");
		treeSet.add("Corridor");
		
		System.out.println("Projects :"+ treeSet);
	
		//TreeMap
	Map<Integer, String> tmap = new TreeMap<>();
	tmap.put(12268, "Venkatesh");
	tmap.put(12035, "Krishna");
	tmap.put(12172, "Rana");
	
	System.out.println("Employee Info : "+ tmap);
	System.out.println("Employee Name by ID : "+ tmap.get(12268));
	
	Set<Entry<Integer, String>> set = tmap.entrySet();
	
	Iterator<Entry<Integer, String>> iterator = set.iterator();
	while(iterator.hasNext()){
		Entry<Integer, String> entry = iterator.next();
		System.out.print("Key :"+entry.getKey());
		System.out.println(" Value :"+entry.getValue());
		}
	//ArrayDeque
	ArrayDeque<String> deque = new ArrayDeque<>();
	deque.add("Corridor");
	deque.add("WM");
	deque.add("SpotCues");
	deque.add("RaveMarketing");
	deque.add("LSUC");
	deque.add("Corridor");
	System.out.println("From ArrayDeque : "+deque);
	System.out.println("Getting 1st element : "+deque.element());
	System.out.println(deque.poll());
	System.out.println("From ArrayDeque : "+deque);
	System.out.println(deque.removeFirst());
	System.out.println("From ArrayDeque : "+deque);
	System.out.println();
	
	}
}
