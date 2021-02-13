package com.stackroute.lamda.passanger;

public class Passenger {
	
	private int tktNo;
	private String name;
	private int age;
	private String city;
	
	public Passenger(int no,String name,int age,String city) {
		this.tktNo = no;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public int getTktNo() {
		return tktNo;
	}

	public void setTktNo(int tktNo) {
		this.tktNo = tktNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Passenger [tktNo=" + tktNo + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public static boolean isSenior(int age) {
		if(age > 64)
			return true;
		else
			return false;
	}
}
