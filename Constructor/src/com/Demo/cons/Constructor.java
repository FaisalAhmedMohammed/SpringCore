package com.Demo.cons;

public class Constructor {
	private int id;
	private String name;
	private double marks;

	public Constructor(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}

class Student {
	public static void main(String[] args) {
		Constructor cs = new Constructor(10, "ashok", 20.0);
		System.out.println(cs);
		cs.setId(20);
		cs.setName("jani basha");
		cs.setMarks(50.0);
		System.out.println(cs);

	}
}
