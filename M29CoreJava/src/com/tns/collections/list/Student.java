package com.tns.collections.list;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private float per;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public Student(int rollNo, String name, float per) {
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Student o) {
		// compare using rollno
		// return this.rollNo-o.rollNo;

		// compare using name
		// return this.name.compareTo(o.name);

		// compare using percentage Descending order
		return (int) (o.per-this.per );
	}

}
