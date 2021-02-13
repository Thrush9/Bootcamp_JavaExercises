package com.stackroute.principleTwo;

public class Structure {
	
	private String name;
	private String category;
	private int count;
	
	public Structure(String name,String category,int num) {
		this.name = name;
		this.category = category;
		this.count = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Structure [name=" + name + ", category=" + category + ", count=" + count + "]";
	}
	
}
