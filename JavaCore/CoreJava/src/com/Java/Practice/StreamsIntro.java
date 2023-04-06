package com.Java.Practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsIntro {
 //Get only 10memebers who age is less than 18
	public static void main(String[] args)  {
		ArrayList<String> people = new ArrayList<String>();
	    people.add("Lavanya");
	    people.add("Srikar");
	    people.add("Manas");
	    people.add("Reethu");
	    //Creates a sequential Stream
	    //intermediate operation(map,filter)
	    Stream<String>myStream=people.stream().filter(p->p.contains("a"));
	    myStream.forEach(P->System.out.print(P));
	    
	    //using intermediate operator 
	    List<String>myStreams=
	    		people.stream().filter(p->p.contains("a"))
	    		.limit(2)
	    		.collect(Collectors.toList());
	    myStreams.forEach(P->System.out.print(P));
	    

	    
	}
}