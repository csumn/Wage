package com.bridgelabz;

public class EmployeeWageProgram {
	static final int WAGEPERHOUR = 20;
	static final int FULLDAYHOURS = 8;
	static final int HALFDAYHOURS = 4;
	static final int HALFDAYPRESENT = 2;
	static final int FULLDAYPRESENT = 1;

	public static void main(String[] args) {

		int value = (int)(Math.random()*10)%3;
		if(value == FULLDAYPRESENT) {
			System.out.println("Emp is present fullday ");
			int employeeWage = WAGEPERHOUR *FULLDAYHOURS;
			System.out.println("Employee Wage is : "+employeeWage);
		}else if(value == HALFDAYPRESENT) {
			System.out.println("Emp is present halfday ");
			int employeeWage = WAGEPERHOUR *HALFDAYHOURS;
			System.out.println("Employee Wage is : "+employeeWage);
		}else
			System.out.println("Emp is Absent : No Wage ");
	}
}
