package com.te.studassig;

import java.util.Comparator;

public class AgeWise implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}

}
