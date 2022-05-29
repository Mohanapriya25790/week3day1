package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Priya");
	}
public void studentDept() {
	System.out.println("dept.of Testing");
}
public void studentId() {
	System.out.println("987654321");
}
public static void main(String[] args) {
	Student first=new Student();
	first.collegeCode();
	first.collegeName();
	first.collegeRank();
	first.deptName();
	first.studentName();
	first.studentDept();
	first.studentId();
}
}
