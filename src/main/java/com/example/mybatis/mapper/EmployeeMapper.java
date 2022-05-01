package com.example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.mybatis.model.Employee;

@Mapper

public interface EmployeeMapper {
	@Select("select * from employees")
	@Results(value = {
			@Result(property = "id",column = "id"),
			@Result(property = "firstName",column = "first_name"),
			@Result(property = "lastName",column = "last_name"),
			@Result(property = "emailAddress",column = "email_address"),
	})
	List<Employee> findAll();
    @Select("SELECT * FROM employees WHERE id = #{id}")
	@Results(value = {
			@Result(property = "id",column = "id"),
			@Result(property = "firstName",column = "first_name"),
			@Result(property = "lastName",column = "last_name"),
			@Result(property = "emailAddress",column = "email_address"),
	})
    public Employee findById(long id);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO employees(id, first_name, last_name,email_address) " +
        " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
    public int insert(Employee employee);

    @Update("Update employees set first_name=#{firstName}, " +
        " last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
    public int update(Employee employee);
}
