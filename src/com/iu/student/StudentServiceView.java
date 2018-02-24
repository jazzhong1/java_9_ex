package com.iu.student;

public class StudentServiceView implements Action{

	


	public void excute(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void excute(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getKor());
			System.out.println(students[i].getMath());
			System.out.println(students[i].getEng());
			System.out.println(students[i].getTotal());
			System.out.println(students[i].getAvg());
		}
		
		
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		
	}
	
	//execute 메서드 
	//학생들의 정보를 받아서 매개변수로 받아서 출력
	//
	

}
