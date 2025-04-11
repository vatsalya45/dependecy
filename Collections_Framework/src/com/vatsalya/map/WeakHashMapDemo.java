package com.vatsalya.map;

import java.util.*;
import java.util.Map.Entry;

import com.vatsalya.collectios_framework.Product;

record product(Integer id , String name) {
	
}
public class WeakHashMapDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashMap<Integer,String> fruits = new HashMap<>();
		fruits.put(1,"Mango");
		fruits.put(2,"Watermelon");
		fruits.put(3,"Papaya");
		fruits.put(4,"Grapes");
		fruits.put(5,"Banana");
		
		Set set = fruits.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) 
		{
			Map.Entry m= (Entry)itr.next();
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		
		weakHashMapTester();
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void weakHashMapTester() {
		
		Product p1 = new Product(1,"Bike");
		Product p2 = new Product(2,"Car");
		Product p3 = new Product(3,"Bus");
		Product p4 = new Product(4,"Truck");
		
		WeakHashMap<Product,String> products = new WeakHashMap<>(); 
		
		products.put(p1,"TVS");
		products.put(p2,"Maruti");
		products.put(p3,"Tata");
		products.put(p4,"Ashok Layland");
		
		Set set = products.entrySet();
		Iterator itr = set.iterator();
		
		itr.forEachRemaining(prod ->System.out.println(prod) );
		
		
	}
}

/*  Program 01 :
------------
Write a program to show that WeakHashMap keys are weak in comparison to HashMap, 
if key is a reference key and it's value is set to be null.*/