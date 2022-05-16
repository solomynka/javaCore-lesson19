package lesson19;

import java.io.Serializable;

public class Employee implements Serializable{

	private double salary;
	private int id;
	private String name;
	
	
	public Employee(double salary, int id, String name) {
		super();
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
