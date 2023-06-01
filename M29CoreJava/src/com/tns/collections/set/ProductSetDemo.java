package com.tns.collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductSetDemo {

	public static void main(String[] args) {
		/*
		 * SortedSet productSet = new TreeSet(); productSet.add("Nashik");
		 * productSet.add("Pune"); productSet.add("Mumbai");
		 * System.out.println(productSet); productSet.add(12); productSet.add(true);
		 * System.out.println(productSet);
		 */
		//Comparator<Product> comp=(p1,p2)->p1.getProdId()-p2.getProdId();
		Comparator<Product> comp=(p1,p2)->(int)(p1.getPrice()-p2.getPrice());
		//Comparator<Product> comp=(p1,p2)->p1.getName().compareTo(p2.getName());
		SortedSet<Product> productSet = new TreeSet<Product>(comp); 
	//	productSet.add("Nashik");
		productSet.add(new Product(101, "Textbook",670));
		productSet.add(new Product(106, "Notebook",120));
		productSet.add(new Product(103, "Register",340));
		productSet.add(new Product(102, "Pen",80));
		System.out.println(productSet);

	}

}
