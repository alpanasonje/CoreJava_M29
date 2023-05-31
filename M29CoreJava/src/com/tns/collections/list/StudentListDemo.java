package com.tns.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentListDemo {

	public static void main(String[] args) {
		/*
		 * Student st[]= new Student[5]; st[0]=new Student(1,"Vibhakti",89); st[1]=new
		 * Student(12,"Rahul",68); st[2]=new Student(5,"Sanket",78); st[3]=new
		 * Student(2,"Vibha",60); st[4]=new Student(3,"Pratiksha",76); List<Student>
		 * studentList=Arrays.asList(st); System.out.println("Original List");
		 * System.out.println(studentList); Collections.sort(studentList);
		 * System.out.println("Student List after sorting on Rollno");
		 * System.out.println(studentList);
		 */
		
		CollegeStudent st[]= new CollegeStudent[5];
		st[0]=new CollegeStudent(1,"Vibhakti",89);
		st[1]=new CollegeStudent(12,"Rahul",68);
		st[2]=new CollegeStudent(5,"Sanket",78);
		st[3]=new CollegeStudent(2,"Vibha",60);
		st[4]=new CollegeStudent(3,"Pratiksha",76);
		List<CollegeStudent> studentList=Arrays.asList(st);
		System.out.println("Original List");
		System.out.println(studentList);
		StudentSortByName comp1=new StudentSortByName();
		Collections.sort(studentList,comp1);
		System.out.println("Student List after sorting on Name");
		System.out.println(studentList);
		StudentSortByRollNo comp2=new StudentSortByRollNo();
		Collections.sort(studentList,comp2);
		System.out.println("Student List after sorting on RollNo");
		System.out.println(studentList);
		StudentSortByPer comp3=new StudentSortByPer();
		Collections.sort(studentList,comp3);
		System.out.println("Student List after sorting on Percentage");
		System.out.println(studentList);
		
	}

}
