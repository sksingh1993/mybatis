package com.example.mybatis;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mybatis.model.Employee;

@MappedTypes(Employee.class)
@MapperScan("com.example.mybatis.mapper")
@SpringBootApplication
//@MapperScan("com.example.mybatis")
//@MappedTypes({Employee.class})

public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

}
