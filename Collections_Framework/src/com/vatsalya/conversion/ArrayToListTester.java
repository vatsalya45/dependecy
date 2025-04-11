package com.vatsalya.conversion;

import java.util.List;

public class ArrayToListTester {

	public static void main(String[] args) {
		
		Integer arr[] = {1,1,2,3,4,4,5,6};
		
		
		
		List<Integer> list = ArrayToListDemo.convertToList(arr);
		//System.out.println(ArrayToListDemo.convertToList(arr));
		System.out.println(list);
	}

}
