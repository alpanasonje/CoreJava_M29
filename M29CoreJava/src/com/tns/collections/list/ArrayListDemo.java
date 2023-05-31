package com.tns.collections.list;

import java.util.ArrayList;

import com.tns.threading.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // Raw list - Heterogenous
		list.add(10);
		list.add(40);
		list.add(34.78);
		list.add(3400888l);
		list.add(true);
		list.add('A');
		list.add("Nashik");
		Person p = new Person();
		p.setId(101);
		p.setName("Nisha");
		list.add(p);
		System.out.println(list);
		}
}
