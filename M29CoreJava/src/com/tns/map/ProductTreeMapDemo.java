package com.tns.map;

import java.util.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ProductTreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<Integer,String>();
		hm.put(21, "Nashik");
		hm.put(12,"Pune");
		hm.put(13, "Delhi");
		hm.put(22, "Nagpur");
		hm.put(12,"Bangalore");
		hm.put(14,"Mumbai");
		hm.put(51, "Delhi");
		System.out.println(hm);
		System.out.println("-------------------------------");
		hm.put(60, null);
		hm.put(20, null);
		System.out.println(hm);
		System.out.println("-------------------------------");
		//hm.put(null, null);
		//hm.put(null, "Indore");	
		System.out.println(hm);
		System.out.println("-------------------------------");
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		System.out.println("-------------------------------");
		Collection<String> cities=hm.values();
		System.out.println(cities);
		System.out.println("-------------------------------");
		Set<Map.Entry<Integer, String>> e=hm.entrySet();
		System.out.println(e);
		System.out.println("-------------------------------");
		Iterator<Map.Entry<Integer, String>> it=e.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("-------------------------------");
		System.out.println(hm.get(12));
		hm.remove(60);
		System.out.println("-------------------------------");
		System.out.println(hm);


	}

}
