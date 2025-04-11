package com.vatsalya.conversion;

import java.util.*;

public class ArrayToListDemo {

	public static List<Integer> convertToList(Integer[] inputArray) {
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(Integer str : inputArray) {
			
			al.add(str);
		}
		return al;
		
		
	}

}
/*  Program: 2
----------------
Write a Java program to convert Array to List.
A BLC class called ArrayToList is given to you.
Add a static method: convertToList(String[] inputArray) : This method 
takes an array of strings as an argument. It should convert the given 
array to a list of Strings and return this list. 
Note that the length of the list must be the same as that of the array. 
Return null for errors a null array or an empty list for an empty 
array.
An ELC Class called Tester with the main method is given to you. Use 
this class to test your solution*/