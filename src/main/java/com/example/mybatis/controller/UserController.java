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
import com.example.mybatis.model.User;
import com.example.mybatis.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List < User > findAll(){
		return userService.findAll();
	}
//	@GetMapping("/{id}")
//    public User findById(@PathVariable long id) {
//		return userService.findById(id);
//    }
//	@DeleteMapping("/{id}")
//    public int deleteById(@PathVariable long id) {
//		return userService.deleteById(id);
//    }
	@PostMapping("/")
    public int insert(@RequestBody User user) {
		return userService.insert(user);
    }
}
