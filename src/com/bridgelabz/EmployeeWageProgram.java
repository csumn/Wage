package com.bridgelabz;

public class EmployeeWageProgram {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation ");
		
		int present = 1;
		int value = (int)(Math.random()*10)%2;
		if(value == present) {
			System.out.println("Emp is present ");
		}else
			System.out.println("Emp is Absent");
	}
}
