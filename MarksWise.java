package com.te.studassig;

import java.util.Comparator;

public class MarksWise implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return (int)o1.marks-(int)o2.marks;
	}

}
