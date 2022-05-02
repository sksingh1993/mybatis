package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.dao.UserDao;
import com.example.mybatis.model.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

//	@Override
//	public User findById(long id) {
//		return userDao.findById(id);
//	}
//
//	@Override
//	public int deleteById(long id) {
//		return userDao.deleteById(id);
//	}
//
	@Override
	public int insert(User User) {
		return userDao.insert(User);
	}

}
