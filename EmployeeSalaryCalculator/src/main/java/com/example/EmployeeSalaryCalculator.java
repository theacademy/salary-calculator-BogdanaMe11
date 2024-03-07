package com.example;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
	// Variable Declaration
	final static int standardWorkingHours = 40;
	static String employeeID;
	static String employeeName;
	static int hoursWorked;
	static int hourlyRate;
	static int basicPay;
	static int overTime;
	static int overTimeRate;
	static int overTimePay;
	static int grossSalary;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.println("Enter an Employee ID: ");
		employeeID = scanner.nextLine();

		System.out.println("Enter an Employee Name: ");
		employeeName = scanner.nextLine();

		System.out.println("Enter the no. of Hours Worked: ");
		hoursWorked = scanner.nextInt();

		System.out.println("Enter the Hourly Rate: ");
		hourlyRate = scanner.nextInt();

		salaryCalculator(hoursWorked, hourlyRate);
		displayPaySlip();
	}

	static int salaryCalculator(int HW, int HR) {
		hourlyRate = HR;
		hoursWorked = HW;

		if (HW <= standardWorkingHours) {
			grossSalary = HR * HW;
			basicPay = HR * HW;
		} else {
			basicPay = HR * standardWorkingHours;
			overTimeRate = 2 * HR;
			overTime = HW - standardWorkingHours;
			overTimePay = overTimeRate * overTime;
			grossSalary = basicPay + overTimePay;
		}
		return grossSalary;
	}

	static void displayPaySlip() {
		System.out.println("===========================================");
		System.out.println("                                     ");
		System.out.println("================PAYSLIP==============");
		System.out.println("                                     ");

		System.out.println("Employee ID    :       " + employeeID);
		System.out.println("Employee Name  :       " + employeeName);
		System.out.println("Hours Worked   :       " + hoursWorked);
		System.out.println("Hourly Rate    :       " + hourlyRate);
		System.out.println("Overtime       :       " + overTime);
		System.out.println("Overtime Rate  :       " + overTimeRate);
		System.out.println("Overtime Pay   :       " + overTimePay);
		System.out.println("Basic Pay      :       " + basicPay);
		System.out.println("                                     ");
		System.out.println("Gross Salary   :       " + grossSalary);
	}
}
