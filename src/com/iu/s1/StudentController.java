package com.iu.s1;


import java.util.*;

import com.iu.student.*;

public class StudentController {
	
	private Scanner sc;
	private Action[] actions;
	
	
	public StudentController(){
		sc=new Scanner(System.in);
		actions=new Action[2];
		actions[0]=new StudentAddService();
		actions[1]=new StudentServiceView();
	}
	
	public void start(){
		//학생한명 바로추가
		//이름번호 입력

		Student students=new Student();
//		StudentInput input=new StudentInput();
//		students=input.addStudent(students);
//		new StudentInfo().StudentView(students);
		
		
		boolean check=true;
		while(check) {

			System.out.println("1.학생추가");
			System.out.println("2.학생정보출력");
			System.out.println("3.프로그램종료");
			int num=sc.nextInt();
			
			actions[num-1].excute(); 	// 배열로 바로 접근할수있게
			actions[num-1].excute(actions[0].excute());
				
		}
		
	
		
	}
}
