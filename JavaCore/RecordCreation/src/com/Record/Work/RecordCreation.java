package com.Record.Work;

public class RecordCreation {

	public static void main(String[] args) {
		//object creation - no setters in record as we are setting value when creating object
		AssociateRecord as1=new AssociateRecord(907,"Lavanya","developer");
		 System.out.println(as1.id() + " " + as1.name() + " " + as1.designation());
		 
		 AssociateRecord as2=new AssociateRecord(903,"Kamal");
		 as2.getNamewithDesignation();
		 
		 System.out.println(as2.getTotalExperience());

		 
		System.out.println(as2.equals(as1));
		 

		System.out.println(as1.toString());
	}

	
}
