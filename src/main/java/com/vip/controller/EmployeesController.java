package com.vip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.vip.entities.Employees;
import com.vip.service.EmployeesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class EmployeesController {

	@Autowired
	private EmployeesService employeeService;
	
	@GetMapping("/employees")
	private ResponseEntity<List<Employees>>getAll() {
		return new ResponseEntity<List<Employees>>(employeeService.getAllEmployees(), HttpStatus.OK);
	} 

//	@RequestMapping(value = "/employee", method = RequestMethod.POST)
//	           or
	@PostMapping("/employees")
	private ResponseEntity<Void>save(@RequestBody Employees employee,UriComponentsBuilder ucBuilder){
		if(employee==null) {
			throw new RuntimeException("Objects cannot be null");
		}
		employeeService.addEmployee(employee);
		HttpHeaders header= new HttpHeaders();
		header.setLocation(ucBuilder.path("/employees/{id}").buildAndExpand(employee).toUri());
		return new ResponseEntity<Void>(header,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/employees/{id}")
	private ResponseEntity<Employees>get(@PathVariable int id) {
		Employees emp=employeeService.getEmployeeById(id);
		if(emp==null) {
			return new ResponseEntity<Employees>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employees>(emp,HttpStatus.OK); 
	}
	
	@PutMapping("/employees/{id}")
	private ResponseEntity<Void> update(@RequestBody Employees toBeUpdateEmp, @PathVariable int id){
		if(toBeUpdateEmp==null) {
			throw new RuntimeException("Objects cannot be null");
		}
		Employees existingEmp=employeeService.getEmployeeById(id);
		if(toBeUpdateEmp== null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
				employeeService.updateEmployee(toBeUpdateEmp);
			 
				return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		
	}
	
	@DeleteMapping("/employees/{id}")
	private ResponseEntity<Void>delete(@PathVariable int id){
	Employees deleteEmployee=employeeService.getEmployeeById(id);
		if(deleteEmployee== null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
				employeeService.deleteEmployee(deleteEmployee);
			 
				return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		
	}
	
}
