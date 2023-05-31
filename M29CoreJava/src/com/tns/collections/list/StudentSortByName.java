package com.tns.collections.list;

import java.util.Comparator;

public class StudentSortByName implements Comparator<CollegeStudent> {

	@Override
	public int compare(CollegeStudent o1, CollegeStudent o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());

	}
}
