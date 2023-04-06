package com.Java.Practice;

public class SwitchCase {
	public static void main(String args[]) {
		Day day = Day.WEDNESDAY;
		// Switch expressions as they were returning using break, yield and ->
		//-> Further instead of returning values, Java 12 introduced arrow operators as a simple alternative:
		System.out.print(switch (day) {
		case SUNDAY, MONDAY, FRIDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> "Invalid day";
		});
		
		//The word “yield” can be used to return the result value.
		//same as yield same as break
		int numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> {
			System.out.println(6);
			yield 6;
		}
		case TUESDAY -> {
			System.out.println(7);
			yield 7;
		}
		case THURSDAY, SATURDAY -> {
			System.out.println(8);
			yield 8;
		}
		case WEDNESDAY -> {
			System.out.println(9);
			yield 9;
		}
		default -> {
			throw new IllegalStateException("Invalid day: " + day);
		}
		};
		System.out.println(test(65));
		 
	    System.out.println(test("Hello Java 17"));
	 
	    System.out.println(test(true));
	 
	    HouseSwitch house = new HouseSwitch(4,2);
	 
	    System.out.println(test(house));
	 
		//Java17 introduced Pattern matching
		//you can pass objects in switch condition and this object can be checked for different types in switch case labels.
		
	
		System.out.print(returndayspecial());	
		
	}

	//same as yield same as break
	public static final String returndayspecial() 

	{		
		String day= "Sunday";
		return  switch (day) {
	    case "Monday":
	        yield ("Weekday");
	    case "Tuesday":
	        yield ("Weekday");
	    case "Wednesday":
	        yield("Weekday");
	    case "Thursday":
	        yield ("Weekday");
	    case "Friday":
	        yield ("Weekday");
	    case "Saturday":
	        yield ("Weekend");
	    case "Sunday":
	        yield ("Weekend");
	    default:
	        yield ("Unknown");	        
		};		
	}
	public static String test(Building b) {
		return switch(b) {
		case Variable v -> "variable object";
		case RestHouseSwitch s -> "String object"; 
	    case HouseSwitch s -> "House object";		 
	    default -> "It is none of the known data types";
		};
	}
	
}
