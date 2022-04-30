package com.example.mybatis.service;

import java.util.List;

import com.example.mybatis.model.Employee;

public interface EmployeeService {
	public List < Employee > findAll();

    public Employee findById(long id);

    public int deleteById(long id);

    public int insert(Employee employee);

    public int update(Employee employee);
}
