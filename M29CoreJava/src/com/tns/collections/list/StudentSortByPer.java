package com.tns.collections.list;

import java.util.Comparator;

public class StudentSortByPer implements Comparator<CollegeStudent> {

	@Override
	public int compare(CollegeStudent o1, CollegeStudent o2) {
		// TODO Auto-generated method stub
		return   (int) (o1.getPer()-o2.getPer());

	}
}
