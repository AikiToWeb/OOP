package ch04;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public String showStudentInfo() {
		
		return studentName + " 학생의 학번은 " + studentNumber + " 학년은 " + grade;
	}
}
