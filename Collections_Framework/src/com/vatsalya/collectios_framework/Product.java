package com.vatsalya.collectios_framework;

public record Product(Integer pid, String pName) {

	public Product
	{
		//Compact contructor for the validation 
		
		if(pid<=0) {
			
			throw new IllegalArgumentException();
		}
	}
}
/* Program 01 :
------------
Create a record called Product which is accepting two components pid and pname.

Write one compact constructor to throw IllegalArgumentException if pid is zero or Negative.

Create one TreeSet class which will hold the Custom product object.

With the help of TreeSet constructor using Comparator interface, write the logic to sort the Product data on the following basis
 
1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.
------------------------------------------------------------- */