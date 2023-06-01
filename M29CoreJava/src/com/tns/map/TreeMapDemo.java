package com.tns.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.tns.collections.set.Product;

public class TreeMapDemo {

	public static void main(String[] args) {
		Comparator<Product> comp=(p1,p2)->p1.getName().compareTo(p2.getName());
		TreeMap<Product, String> productMap=new TreeMap<Product,String>(comp);
		productMap.put(new Product(101, "Textbook",670),"Nashik");
		productMap.put(new Product(106, "Notebook",120),"Pune");
		productMap.put(new Product(103, "Register",340),"Delhi");
		productMap.put(new Product(102, "Pen",80),"Mumbai");
		System.out.println(productMap);
		System.out.println("-------------------------------");
		Set<Product> keys=productMap.keySet();
		System.out.println(keys);
		System.out.println("-------------------------------");
		Collection<String> cities=productMap.values();
		System.out.println(cities);
		System.out.println("-------------------------------");
		Set<Map.Entry<Product, String>> e=productMap.entrySet();
		System.out.println(e);
		System.out.println("-------------------------------");
		Iterator<Map.Entry<Product, String>> it=e.iterator();
		while(it.hasNext())
		{
			Map.Entry<Product, String> entry=it.next();
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("-------------------------------");
		System.out.println(productMap.get(new Product(102, "Pen",80)));
		productMap.remove(new Product(102, "Pen",80));
		System.out.println("-------------------------------");
		System.out.println(productMap);


	}

}
