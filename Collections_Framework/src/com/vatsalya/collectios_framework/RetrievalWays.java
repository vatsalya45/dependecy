package com.vatsalya.collectios_framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievalWays {

	public static void main(String[] args) {
		
		Vector<String> cricketers = new Vector<>();
		cricketers.add("Sachin");
		cricketers.add("Rohit");
		cricketers.add("Virat");
		cricketers.add("Dhoni");
		cricketers.add("Bumrah");
		cricketers.add("Bhuvi");
		
		
		System.out.println("By using toString()");
		System.out.println(cricketers.toString());
		//System.out.println(cricketers.toString());
		
		System.out.println("By using ordinary for loop");
		for(int i = 0 ; i < cricketers.size(); i++) {
			
			System.out.println(cricketers.get(i));
			
		}
		
		System.out.println("By using enhanced for loop");
		
		for(String cricketer : cricketers) {
			
			System.out.println(cricketer);
		}

		System.out.println("By using enumaration interface");
		
		Enumeration<String> el = cricketers.elements();
		
		while(el.hasMoreElements()) {
			
			System.out.println(el.nextElement());
		}
		
		System.out.println("By using iterator interface");
		
	    Iterator<String> itr = cricketers.iterator();
	    itr.forEachRemaining(cricketer -> System.out.println(cricketer));
	    
	    System.out.println("By using listIterator");
	    
	    ListIterator<String> lstr = cricketers.listIterator();
	    //lstr.forEachRemaining(cricketer-> System.out.println(cricketer));
	    
	    System.out.println("In forward direction");
	    while(lstr.hasNext()) {
	    	
	    	System.out.println(lstr.next());
	    }
	    System.out.println("In backward direction");
	    while(lstr.hasPrevious()) {
	    	
	    	System.out.println(lstr.previous());
	    }
	    
	    System.out.println("By using spliterator");
	    Spliterator<String> splitr = cricketers.spliterator();
	    splitr.forEachRemaining(cricketer->System.out.println(cricketer));
	    
	    System.out.println("By using forEach method");
	    cricketers.forEach(cricketer->System.out.println(cricketer));
	    
	    System.out.println("By using method reference");
	    cricketers.forEach(System.out::println);
	    
	}
	

}
//WAP that describes how to retrieve the Objects by using above 9 ways :






