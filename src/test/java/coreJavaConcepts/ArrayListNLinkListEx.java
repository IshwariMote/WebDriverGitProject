package coreJavaConcepts;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListNLinkListEx {

	
//	ArrayList: Stores elements in a dynamic array, providing fast random access but slower inserts and deletes.
//	LinkedList: Stores elements as a doubly-linked list, offering faster insertions and deletions but slower random access.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("Selenium");
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		arrayList.remove(0);
		
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("SQL");
		linkedList.add("Maven");
		
		System.out.println(linkedList);
		System.out.println(linkedList.get(0));
		
		linkedList.remove(0); ///remove or to delete as its faster for add and deleetion 

	}

}
