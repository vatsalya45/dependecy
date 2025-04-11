package com.vatsalya.collectios_framework;

public record Book(String name, String author)  implements Comparable<Book>
{

	@Override
	public int compareTo(Book z) {
		
		return this.name.compareTo(z.name);
	}

	
}
/* Program 02 :
------------
Create a record called Book which take two components name and author.

Implement this Book record with Comparable interface to sort the books based on the name using compareTo() method.

Create an ELC class BookSorted which will sort the book based on the name.

Create one TreeSet object which will hold Book as a custom object.

Insert 5 book records using custom object.

Display all the books sorted in alphabetial order. */