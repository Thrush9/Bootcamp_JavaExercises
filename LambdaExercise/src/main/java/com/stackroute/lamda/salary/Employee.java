package com.stackroute.lamda.salary;

public class Employee {

	private int id;
	private int deptno;
	private int salary;
	
	public Employee(int id,int no,int amt) {
		this.id = id;
		this.deptno = no;
		this.salary = amt; 	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptno=" + deptno + ", salary=" + salary + "]";
	}
	
}
