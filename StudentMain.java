package com.te.studassig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(01, 23, "Samid", 70));
		set.add(new Student(01, 22, "Max", 76));
		set.add(new Student(02, 18, "Mohammed", 93));
		set.add(new Student(03, 24, "Mitcheel", 64));
		set.add(new Student(04, 24, "Mason", 70));
		set.add(new Student(04, 25, "Mohammed", 88));

		List<Student> arraylist = new ArrayList<>(set);
		Scanner sc = new Scanner(System.in);
		int chck = 1;
		int i = 1;
		while (chck <= 4) {
			if (chck == i) {
				System.out.println("Enter number 1 to sort by ID");
				System.out.println("Enter number 2 to sort by Age");
				System.out.println("Enter number 3 to sort by Name");
				System.out.println("Enter number 4 to sort by Marks");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					Collections.sort(arraylist, new IdWiseSort());
					for (Student student : arraylist) {
						System.out.println(student);
					}
					break;
				case 2:
					Collections.sort(arraylist, new AgeWise());
					for (Student student : arraylist) {
						System.out.println(student);
					}
					break;
				case 3:
					Collections.sort(arraylist, new NameWise());
					for (Student student : arraylist) {
						System.out.println(student);
					}
					break;
				case 4:
					Collections.sort(arraylist, new MarksWise());
					for (Student student : arraylist) {
						System.out.println(student);
					}
					break;
				default:
					System.out.println("Invalid Input");
				}

				chck++;
				i++;
				System.out.println("Do you want to continue?");
				System.out.println("Press y/n");
				String dec = sc.next();
				
				if (dec.equals("n")) {
					chck = 5;
				}
			}

		}
		System.out.println("Thank You");
	}
}
