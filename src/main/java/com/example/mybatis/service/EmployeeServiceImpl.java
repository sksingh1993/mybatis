package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.model.Employee;
import com.example.mybatis.repository.EmployeeMyBatisRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeMyBatisRepository employeeRepo;
	
	@Override
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee findById(long id) {
		Employee findById = employeeRepo.findById(id);
		return employeeRepo.findById(id);
	}

	@Override
	public int deleteById(long id) {
		return employeeRepo.deleteById(id);
	}

	@Override
	public int insert(Employee employee) {
		return employeeRepo.insert(employee);
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    

}
