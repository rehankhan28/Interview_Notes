package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/api/v1")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository emprepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return emprepository.findAll();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getUserById(@PathVariable(value = "id") Long userId)
			throws ResourceNotFoundException {
		Employee employee = emprepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User Not Found" + userId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Employee createUser(@RequestBody Employee employee) {
		return emprepository.save(employee);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
		Employee employee = emprepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Resource Not Found :" + userId));
		emprepository.delete(employee);
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("deleted", Boolean.TRUE);
		return map;
	}
}