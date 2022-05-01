package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.mapper.EmployeeMapper;
import com.example.mybatis.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	//@Autowired
	//private EmployeeMyBatisRepository employeeRepo;
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> findAll() {
		return employeeMapper.findAll();
	}

	@Override
	public Employee findById(long id) {
		Employee findById = employeeMapper.findById(id);
		return employeeMapper.findById(id);
	}
//
//	@Override
//	public int deleteById(long id) {
//		return employeeMapper.deleteById(id);
//	}
//
//	@Override
//	public int insert(Employee employee) {
//		return employeeMapper.insert(employee);
//	}

	
    

}
