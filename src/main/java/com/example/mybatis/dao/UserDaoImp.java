package com.example.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.User;
@Repository
public class UserDaoImp implements UserDao{
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

//	@Override
//	public User findById(long id) {
//		return userMapper.findById(id);
//	}
//
//	@Override
//	public int deleteById(long id) {
//		return userMapper.deleteById(id);
//	}
//
//	@Override
//	public int insert(User User) {
//		return userMapper.insert(User);
//	}

}
