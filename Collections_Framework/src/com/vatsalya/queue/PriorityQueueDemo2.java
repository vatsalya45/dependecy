package com.vatsalya.queue;

import java.util.*;
public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		
		var pq1 = new PriorityQueue<String>();
		
		pq1.add("Red");
		pq1.add("Blue");
		pq1.add("Green");
		pq1.add("Yellow");
		
		
		var pq2 = new PriorityQueue<String>();
		pq2.add("Red");
		pq2.add("Blue");
		pq2.add("Green");
		pq2.add("Yellow");
		
		pq2.addAll(pq1);
		
		System.out.println(pq2);
		
		
	}

}
/* Que-2
____________________________
Create a Java program that demonstrates how to merge two PriorityQueue instances. 
The program should perform the following tasks:

Initialize two PriorityQueue objects, queue1 and queue2, each storing strings.
Add three different colors to queue1: "Red", "Green", and "Orange".
Add three different colors to queue2: "Pink", "White", and "Black".
Print the elements of both queue1 and queue2.
Merge queue2 into queue1 using the addAll method.
Print the elements of the merged queue1.

Requirements:
---------------------
Your program should use the PriorityQueue class from the java.util package.
The elements should be added in the specified order to each queue.
Display the elements of both priority queues before and after merging.
The final output should show the contents of queue1 after merging queue2 into it.

Sample Output:
Priority Queue1: [Green, Red, Orange]
Priority Queue2: [Black, White, Pink]
New Priority Queue1: [Black, Green, Orange, Red, White, Pink]
----------------------------------------------------------------------------

 */