package com.training.util;

import java.util.Scanner;

public class Studentmarkdetails {
	public void gradeDetails(float avg) {
		if (avg >= 90)
			System.out.println("A Grade" + avg);
		else if (avg >= 80 && avg < 90)
			System.out.println("B Grade");
		else if (avg >= 70 && avg < 80)
			System.out.println("C Grade");
		else
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		float[] marks = new float[8];
		float sum = 0, avg;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks in 8 Subjects: ");
		for (i = 0; i < 8; i++)
			marks[i] = sc.nextFloat();
		for (i = 0; i < 8; i++)
			sum = sum + marks[i];
		avg = sum / 8;
		Studentmarkdetails st = new Studentmarkdetails();
		st.gradeDetails(avg);
		System.out.println(avg);
	}
}