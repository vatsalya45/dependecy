package com.vatsalya.queue;

import java.util.*;

public class PriorityQueueDemo {

	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Red");
		pq.add("Orange");
		pq.add("White");
		pq.add("Black");
		pq.add("Pink");
		pq.add("Green");
		
		System.out.println(pq);
		
		
		
	}
	
}
/*  Que-1
____________________________
Create a Java program that uses a PriorityQueue to manage a collection of strings. 
You need to implement the following functionality:

Initialize a PriorityQueue that stores strings.
Add five different colors ("Red", "Green", "Orange", "White", "Black") to the queue.
Print all elements of the priority queue.

Requirements:
--------------------
Your program should use the PriorityQueue class from the java.util package.
The elements should be added in the specified order: "Red", "Green", "Orange", "White", "Black".
Display the elements of the PriorityQueue after all elements have been added.
--------------------------------------------------------------------------------------------- */