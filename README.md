# CoreJava

Lambdas:  

Lambda expressions work with functional interfaces(interfaces with one abstract method) 

https://www.geeksforgeeks.org/lambda-expressions-java-8/ 

Var Keyword : https://www.studytonight.com/java-11/using-var-in-lambda-expression-java-11 

 

Streams: 

a pipeline of computational operations 

 java.util.stream – which contains classes for processing sequences of elements. 

Java streams represent a pipeline through which data will flow and the functions to operate on the data.  

2 types of operations : 

They are divided into intermediate operations (return Stream<T>) and terminal operations (return a result of definite type). 

Operations are Map, filter and reduce. 

Map and reduce - https://www.java67.com/2016/09/map-reduce-example-java8.html 

 

Filter – return true or false (condition checking) 

Map  -  

map() 

MaptoInt() 

FlatMap() - https://www.geeksforgeeks.org/stream-flatmap-java-examples/?ref=lbp 

 

 

Definition : map() takes a Stream and transform it to another Stream. It applies a function on each element of Stream and store return value into new Stream. 

 

Understanding: 

iterate though the stream (return results of applying the given function to the elements of this stream) - returns all elements in the stream 

 

Reduce: 

a stream reduces to single resultant value, for example, maximum, minimum, sum, product, etc. 

 

Switch case – Java 17 

https://medium.com/@javatechie/the-evolution-of-switch-statement-from-java-7-to-java-17-4b5eee8d29b7 

 

Switch expression features 

https://fullstackdeveloper.guru/2021/08/11/pattern-matching-for-switch-java-17/ 

Pattern matching 

Guarded pattern 

Null cases 

 

 

 

 

 

For enhancements: 

for-each loop : 

The syntax is greatly simplified, and the loop maintains no explicit counter: they essentially say “do this to everything in this collection”, rather than “do this x times”(unlike traditional -for loop) 

Records 

https://docs.oracle.com/en/java/javase/14/language/records.html 

https://www.geeksforgeeks.org/what-are-java-records-and-how-to-use-them-alongside-constructors-and-methods/ 

a record is a special type of class declaration aimed at reducing the boilerplate code.   

While defining a record, all the instance fields are written as parameters. The constructor, getter methods, toString(), equals(), and hashCode() are generated by the Java compiler during compile time. 

 

Advantages of Record - 

Autogenerated constructor 

Auto generated getter methods 

Auto generated toString(), equals(), and hashCode() 

Auto generated immutable fields and final/static fields 

 

 

 
