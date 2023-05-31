package com.tns.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(100);
		list.add(60);
		list.add(30);
		System.out.println("Linked List is " + list);
		list.addFirst(5);
		list.addLast(2999);
		list.add(1, 45);
		System.out.println("Linked List is " + list);
		System.out.println("First Element : " + list.getFirst());
		System.out.println("Last Element : " + list.getLast());

		list.removeFirst();
		list.removeLast();
		System.out.println("Linked List is " + list);
		System.out.println("-----------------------");
		ListIterator<Integer> lit = list.listIterator();

		while (lit.hasNext()) {
			int n = lit.next();
			System.out.println(n);
			if (n == 100)
				lit.set(200);
			if (n==45)
				lit.add(450);
			if(n==60)
				lit.remove();
		}
		System.out.println("-----------------------");
		System.out.println(list);
		System.out.println("-----------------------");
		lit = list.listIterator(list.size());
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("-----------------------");
	}

}
