package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UniqueValue {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "ABCD", 23, "Male"));
		employees.add(new Employee(1, "ABCD", 23, "Male"));
		employees.add(new Employee(2, "XYZ", 34, "FeMale"));
		employees.add(new Employee(1, "DDDD", 45, "FeMale"));
//		List<Employee> out = employees.stream().distinct().collect(Collectors.toList());
//		out.forEach(System.out::println);

		List<Employee> agesort = employees.stream().distinct().sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());
		agesort.forEach(System.out::println);
	}
}

class Employee {
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
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
