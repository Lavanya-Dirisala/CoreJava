package com.Java.Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class EnhancedForLoop {
	public static void main(String args[]) {
		// HashSet
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(2);
		set.add(3);
		printset(set);

		// list
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lavanya");
		list.add("Anjani");
		list.add("Nagendra");
		// ForEach internally invokes the iterator() method
		for (String name : list) {
			System.out.print(name + " ");
		}

	}

	// enhanced for loop with generics(parameterized types -The idea is to allow
	// type (Integer, String, … etc., and user-defined types)
	private static <T> void printset(HashSet<T> set) {
		for (T element : set) {
			System.out.println(element);
		}

	}
}
