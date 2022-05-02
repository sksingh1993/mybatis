package com.example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.mybatis.model.Employee;
import com.example.mybatis.model.User;

@Mapper
public interface UserMapper {
	List<User> findAll();

    public User findById(long id);

    //@Delete("DELETE FROM users WHERE id = #{id}")
//    public int deleteById(long id);

    public int insert(@Param("user") User user);

//    @Update("Update users set first_name=#{firstName}, " +
//        " last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
//    public int update(User user);

}
