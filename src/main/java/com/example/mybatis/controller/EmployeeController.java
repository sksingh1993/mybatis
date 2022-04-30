package com.example.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis.model.Employee;
import com.example.mybatis.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List < Employee > findAll(){
		return employeeService.findAll();
	}
	@GetMapping("/{id}")
    public Employee findById(@PathVariable long id) {
		return employeeService.findById(id);
    }
	@DeleteMapping("/{id}")
    public int deleteById(@PathVariable long id) {
		return employeeService.deleteById(id);
    }
	@PostMapping("/")
    public int insert(@RequestBody Employee employee) {
		return employeeService.insert(employee);
    }


}
