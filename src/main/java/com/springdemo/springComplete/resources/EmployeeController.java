package com.springdemo.springComplete.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springdemo.springComplete.entity.Employee;
import com.springdemo.springComplete.exceptions.ErrorStatus;
import com.springdemo.springComplete.service.EmployeeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.getEmploees();
	}
	
	@GetMapping("/{id}")
	public Employee	 getEmployeeById(@PathVariable("id") int id){
		int a=5/0;
		return employeeService.getEmployeeById(id);
	}

	@PostMapping	("/post")
	public Employee insertEmployee(@RequestBody @Valid Employee employee){
		return employeeService.insertEmployee(employee);
	}

	@PutMapping("/put")
	public Employee updateEmployee(@RequestBody @Valid Employee employee){
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int employeeId){
		 employeeService.deleteEmployee(employeeId);
		 return employeeId+" successfully deleted";
	}
	
}
