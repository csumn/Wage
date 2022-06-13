package com.bridgelabz;

public class EmployeeWageProgram {
	static final int WAGEPERHOUR = 20;
	static final int FULLDAYHOURS = 8;

	public static void main(String[] args) {

		int present = 1;
		int value = (int)(Math.random()*10)%2;
		if(value == present) {
			System.out.println("Emp is present ");
			int employeeWage = WAGEPERHOUR *FULLDAYHOURS;
			System.out.println("Employee Wage is : "+employeeWage);
		}else
			System.out.println("Emp is Absent : No Wage ");
	}
}
