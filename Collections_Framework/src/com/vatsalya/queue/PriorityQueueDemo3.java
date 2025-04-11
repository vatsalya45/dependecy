package com.vatsalya.queue;

import java.util.*;
public class PriorityQueueDemo3 {

	public static void main(String[] args) {
		
		var pq1 = new PriorityQueue<String>();
		pq1.add("Red");
		pq1.add("Yellow");
		pq1.add("Green");
		pq1.add("Hot Pink");
		pq1.add("Light Orange");
		
		System.out.println(pq1);
		
		var pq2 = new PriorityQueue<String>();
		pq2.add("Blue");
		pq2.add("Red");
		pq2.add("Green");
		pq2.add("Dark Blue");
		pq2.add("Cyan");
		
		System.out.println(pq2);
		
		//System.out.println(pq2.containsAll(pq1));
		
//		for(String s : pq1) {
//			
//			System.out.println(pq2.contains(s)? "Yes" : "No" );
//		}
		
		pq1.forEach(str -> System.out.println(pq2.contains(str)?"yes":"no"));
	}

}
/* Que-3
____________________________
Problem Statement:

Create a Java program that performs the following tasks:

Initialize two PriorityQueue objects, pq1 and pq2, each storing strings.
Add four different colors to pq1: "Red", "Green", "Black", and "White".
Add four different colors to pq2: "Red", "Pink", "Black", and "Orange".
Print the elements of both pq1 and pq2.
Compare the elements of pq1 with the elements of pq2 and 
print "Yes" if an element of pq1 is present in pq2, otherwise print "No".

Requirements:
---------------------
Your program should use the PriorityQueue class from the java.util package.
The elements should be added in the specified order to each queue.
Display the elements of both priority queues before the comparison.
For each element in pq1, check if it exists in pq2 and print "Yes" if it does, otherwise print "No".

Sample Output:

First Priority Queue: [Black, Green, Red, White]
Second Priority Queue: [Black, Orange, Pink, Red]
Yes
No
Yes
No
--------------------------------------------
 */