package com.tns.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Neha");
		ts.add("Sakshi");
		ts.add("Shrutika");
		ts.add("Purvi");
		ts.add("Rajashree");
		ts.add("Purvi");
		//ts.add(null); NullPointerException
		System.out.println(ts);
		

	}

}
