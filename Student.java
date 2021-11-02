package com.te.studassig;

public class Student {
	int id;
	int age;
	String name;
	double marks;

	public Student(int id, int age, String name,double marks) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return id;
	}


	@Override
	public boolean equals(Object obj) {
		Student st=(Student)obj;
		return this.id==st.id;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}

	

}
