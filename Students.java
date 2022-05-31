package org.student;

public class Students {
public void getStudentInfo(int studentID) {
	System.out.println(studentID);
}
public void getStudentInfo(int studentID, String name) {
	System.out.println(studentID,"name");
}
public void getStudentInfo(String email,long phoneNumber) {
	System.out.printf(email,phoneNumber);
}
	public static void main(String[] args) {
	
Students info = new Students();
info.getStudentInfo(251);
info.getStudentInfo(252,"Priya");
info.getStudentInfo("priyakrish@gmail.com", 9876543210l);


	}

}
