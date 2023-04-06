package com.Java.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStuOperations {
	public static void main(String[] args) {

		Student s1 = new Student("lavanya", 41);
		Student s2 = new Student("kamal", 21);
		Student s3 = new Student("sri", 49);
		Student s4 = new Student("teja", 54);
		ArrayList<Student> mylist = new ArrayList<>();
		// add all students to linked list
		// student 4 must not be inserted becuase, it has same id
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		mylist.add(s4);

		// filter
		System.out.println("----Streams filter-----");
		List<Student> Studentsgreaterthan40 = mylist.stream().filter(p -> p.getAge() > 40)
				.filter(p -> p.getName().contains("a") || p.getName().contains("s")).collect(Collectors.toList());

		Studentsgreaterthan40.forEach(p -> System.out.println(p.getName() + p.getAge()));

		// map
		System.out.println("----Streams Map 1----- ");
		Stream<Object> myStream = mylist.stream().map(p -> p.getAge());
		myStream.forEach(p -> System.out.print(p + " "));


		System.out.println();
		System.out.println("----Streams Map 2----- ");
		List<String> uppercaseNames = mylist.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		uppercaseNames.forEach(ele -> System.out.println(ele));

		// 1.maptoInt - return a integer stream
		System.out.println();
		System.out.println("----Streams MaptoInt 1----- ");
		mylist.stream().mapToInt(num -> (num.getAge()) + 1).forEach(System.out::println);

		// 2.maptoInt
		System.out.println("----Streams MaptoInt 2----- ");
		mylist.stream().mapToInt(num -> (num.getAge())).filter(num -> num % 3 == 0).forEach(System.out::println);

		// FlatMap
		// flatMap() is used for both transformation and flattening.
		// example [[1,2],[5,6,7]] to [1,2,5,6,7]
		System.out.println("----Streams FlatMap----- ");
		List<Integer> PrimeNumbers = Arrays.asList(2, 3);
		List<Integer> OddNumbers = Arrays.asList(6, 8, 10);
		List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers);

		System.out.println("The Structure before flattening is : " + listOfListofInts);

		// Using flatMap for transformating and flattening.
		List<Integer> listofInts = listOfListofInts.stream().flatMap(list -> list.stream())
				.collect(Collectors.toList());

		System.out.println("The Structure after flattening is : " + listofInts);

		// Reduce
		/*
		 * reduce operation applies a binary operator to each element in the stream
		 * where the first argument to the operator is the return value of the previous
		 * application and second argument is the current stream element.
		 */

		System.out.println("----Streams Reduce 1----- ");
		List<String> words = Arrays.asList("we", "cannot", "doing", " letsconnect");
		//type Optional as return value can be null
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		// Displaying the longest String
		longestString.ifPresent(System.out::println);
		
		System.out.println("----Streams Reduce 2-----");
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
		//Optional<Integer> op =Optional.ofNullable(array.stream().reduce(0,(element1, element2) -> element1 + element2));
		int sum = array.stream().reduce(0,(element1, element2) -> element1 + element2);
		System.out.println("Sum is " + sum);
		

		System.out.println("----Streams Reduce 3-----");
		OptionalInt rangeMultiply = IntStream.range(2, 4)
				.reduce((a,b)-> a+b);
		System.out.print(rangeMultiply);		
				
  
	}
}
