package com.stackroute.lamda.salary;

public class EmployeeSalaryProcess {

	public static void main(String[] args) {
		iCalculate getSalary = (salary)-> { return salary*10/100;  };
		Employee emp = new Employee(101, 3, 15000);
		int bonus = getSalary.bonusProcess(emp.getSalary());
		System.out.println("Bonus salary calculated : " + bonus);
	}

}
