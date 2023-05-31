package com.tns.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.tns.threading.Person;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); // Homogenous
		list1.add("Aniket");
		list1.add("Nikhil");
		list1.add("Pooja");
		list1.add("Nitin");
		list1.add("Ankita");
		list1.add(2, "Deepak");
		// list1.add(true); CTE
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1);
		System.out.println(list1.contains("Nikhil"));
		System.out.println(list1.remove("Pooja"));
		System.out.println(list1.remove("Nitin"));
		System.out.println(list1);
		System.out.println(list1.remove(1));
		System.out.println(list1);
		//System.out.println(list1.remove(11));
		list1.clear();
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		System.out.println(list2.add(10));
		list2.add(5);
		list2.add(8);
		list2.add(2);
		list2.add(9);
		System.out.println(list2.add(10));
		list2.add(6);
		System.out.println(list2);
		System.out.println(list2.indexOf(10));
		System.out.println(list2.lastIndexOf(10));
		System.out.println(list2.get(3));
		System.out.println(list2.indexOf(100));
	//	System.out.println(list2.get(8));	
		
		System.out.println("Integer List is as follows : ");
		Iterator<Integer> it=list2.iterator();
		int oddCnt=0;
		while(it.hasNext())
		{
		//	System.out.println(it.next());
			int no=it.next();
			if(no%2!=0)
				oddCnt++;
		}
		System.out.println("No. of Odd Elements are "+oddCnt);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		
		ArrayList<Person> personList=new ArrayList<Person>();
		Person p1=new Person(101, "Shrutika");
		personList.add(p1);
		p1=new Person(102, "Krutika");
		personList.add(p1);
		p1=new Person(107, "Nikita");
		personList.add(p1);
		p1=new Person(104, "Neha");
		personList.add(p1);
		System.out.println(personList);
		//Comparator<Person> comp=(o1,o2)->o1.getName().compareTo(o2.getName());
		Comparator<Person> comp=(o1,o2)->o1.getId()-o2.getId();
		Collections.sort(personList,comp);
		System.out.println(personList);
		
		/*
		 * int compare(Person o1, Person o2) { return
		 * o1.getName().compareTo(o2.getName()); }
		 */
		
		
		
	}

}
