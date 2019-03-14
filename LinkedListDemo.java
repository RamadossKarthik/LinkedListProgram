package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	
	/***
	 * 
	 * ArrayList - When you want to add and remove the element from the end, usage of arraylist is advisable
	 * LinkedList - When you want to add and remove the element from the beginning , usage of linked list is advisable
	 * List is the interface that implements the linked  list and array list.
	 * So arraylist and linked list are the classes which implements the list interface
	 * the usage of linked list and array list are same because of the above point.
	 */
	
public static void test1(){
		
		LinkedList cars = new LinkedList();
		
		// addition of the objects(elements)
		
		cars.add(7);
		cars.add("Karthik");
		cars.add("Candyyy");
		cars.add("honey");
		System.out.println(cars);
		
		
		// Get the elements using index
		
		System.out.println(cars.get(0));
		
		//size
		
		int length = cars.size();
		
		//a
		
		System.out.println(cars.size());
		
		// iteration
		
		for(int i=0; i<length; i++ ) {
			
			System.out.println("The element of the index " + i + " is : " + cars.get(i));
			
		}
		
		System.out.println("*********************************************************************************");
		
		//removing the element and iterating the element using for each element
	
		cars.remove(2);
		
		
		for(Object car : cars) {
			System.out.println(car);
			
		}
	}
	
	
	public static void main(String[] args) {
		test1();
		
	}

	

}
