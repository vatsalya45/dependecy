package com.vatsalya.collectios_framework;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) 
	{
		TreeSet<Product> products = new TreeSet<Product>((p1,p2)-> p1.pName().compareTo(p2.pName()));
		//here we are writing a body of the functuonal interface of Comparator in which we are using the comapreTo method of Comparable FI whose body is written in String class.
		
		products.add(new Product(987,"Car"));
		products.add(new Product(977,"Bike"));
		products.add(new Product(947,"Aeroplane"));
		products.add(new Product(937,"Train"));
		products.add(new Product(917,"Bus"));
		
		
		//System.out.println("By using method reference");
	    //cricketers.forEach(System.out::println);
		
		products.forEach(System.out::println);
		
	}

}
/*  Create one TreeSet class which will hold the Custom product object.

With the help of TreeSet constructor using Comparator interface, write the logic to sort the Product data on the following basis
 
1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order. */