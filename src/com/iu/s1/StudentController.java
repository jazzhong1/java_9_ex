package com.iu.s1;


import java.util.*;

import com.iu.student.*;

public class StudentController {
	
	private Scanner sc;
	private Action[] actions;
	private Student[] s;
	
	
	public StudentController(){
		sc=new Scanner(System.in);
		actions=new Action[2];
		actions[0]=new StudentAddService();
		actions[1]=new StudentServiceView();
		Student[] s=null;
	}
	
	public void start(){
		//학생한명 바로추가
		//이름번호 입력

		Student students=new Student();
		
		boolean check=true;
		while(check) {
			
			
			System.out.println("1.학생추가");
			System.out.println("2.학생정보출력");
			System.out.println("3.프로그램종료");
			int num=sc.nextInt();
			
			actions[num-1].excute(); 	// 배열로 바로 접근할수있게
			actions[num-1].excute(StudentDataBase.students);	//여기서 입력이 한번더 된다. (때문에)
				
		}
		
	
		
	}

}
