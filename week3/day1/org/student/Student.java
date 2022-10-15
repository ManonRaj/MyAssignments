package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	// :studentName(),studentDept(),studentId()
	public String stdntName = "Manon";
	public String stdntDept = "Computer Sceince";
	public int stdntId = 827622;

	public void studentName() {
		System.out.println("Student Name is :" + stdntName);
	}

	public void stdntDept() {
		System.out.println("Student Department is :" + stdntDept);
	}

	public void studentId() {
		System.out.println("Student Id is:" + stdntId);
	}

	public static void main(String[] args) {

		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.deptName();
		student.studentName();
		student.stdntDept();
		student.studentId();

	}

}
