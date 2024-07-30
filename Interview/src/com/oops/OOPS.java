package com.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class OOPS {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "ABCD", 22, "Male"));
		list.add(new Employee(1, "ABCD", 22, "Male"));
		list.add(new Employee(2, "XYZ", 4, "Female"));
		List<Employee> out = list.stream().distinct().collect(Collectors.toList());
		out.forEach(System.out::println);
	}
}

class Employee {
	// id,name,age gender
	long id;
	String name;
	long age;
	String gender;

	public Employee(long id, String name, long age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}