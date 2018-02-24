package com.iu.student;

public class StudentAddService implements Action {
	
	//excute메서드 생성
	//내용은 매개변수로 받은 학생을
	//studentDatabase에 있는
	//student의 값이 null이면 
	


	public Student[] excute() {

		Student students=new Student();
		StudentInput input=new StudentInput();
		students=input.addStudent(students);

		
		int count=1;
		if(StudentDataBase.students==null){
			StudentDataBase.students=new Student[count];
			StudentDataBase.students[count-1]=new Student();
			StudentDataBase.students[count-1]=students;
			return StudentDataBase.students;
		}
		else{
			
			int counts = StudentDataBase.students.length;
			Student[] s = new Student[counts+1];
			
			for (int i = 0; i < counts; i++) {
				s[i]=StudentDataBase.students[i];
				
			}
			
			s[counts]=students;
			return s;
		}		
	}

	public void excute(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void excute(Student[] students) {
		// TODO Auto-generated method stub
		
	}
}
