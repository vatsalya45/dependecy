package com.vatsalya.collectios_framework;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		
		TreeSet<Book> books = new TreeSet<Book>();
		
		
		Book book1 = new Book("core java", "ravi");
		Book book2 = new Book("python","gulle");
		Book book3 = new Book("nodejs", "kallu");
		Book book4 = new Book("adv java", "venket");
		Book book5 = new Book("c++","kishore");
		Book book6 = new Book("UI", "sky");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		//books.add(null);
		
		books.forEach(System.out::println);

	}

}
/* Create an ELC class BookSorted which will sort the book based on the name.

Create one TreeSet object which will hold Book as a custom object.

Insert 5 book records using custom object.

Display all the books sorted in alphabetial order. */ 