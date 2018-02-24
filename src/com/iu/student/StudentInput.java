package com.iu.student;

import java.util.*;

public class StudentInput {

	public Student addStudent(Student students) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("이름입력:");
			students.setName(sc.next());
			System.out.print("번호:");
			students.setNum(sc.nextInt());
			System.out.print("국어점수:");
			students.setKor(sc.nextInt());
			System.out.print("영어점수:");
			students.setEng(sc.nextInt());
			System.out.print("수학점수:");
		
		sc.close();
		return students;
	}
}
