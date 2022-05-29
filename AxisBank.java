package org.student;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Axis Bank");
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.deposit();
}
}
