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
import com.example.mybatis.model.User;

@Mapper
public interface UserMapper {

//	@Select("select * from users")
//	@Results(value = {
//			@Result(property = "id",column = "id"),
//			@Result(property = "firstName",column = "first_name"),
//			@Result(property = "lastName",column = "last_name"),
//			@Result(property = "emailAddress",column = "email_address"),
//	})
	List<User> findAll();
//    @Select("SELECT * FROM users WHERE id = #{id}")
//	@Results(value = {
//			@Result(property = "id",column = "id"),
//			@Result(property = "firstName",column = "first_name"),
//			@Result(property = "lastName",column = "last_name"),
//			@Result(property = "emailAddress",column = "email_address"),
//	})
 //   public User findById(long id);

    //@Delete("DELETE FROM users WHERE id = #{id}")
//    public int deleteById(long id);

//    @Insert("INSERT INTO users(id, first_name, last_name,email_address) " +
//        " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
//    public int insert(User user);

//    @Update("Update users set first_name=#{firstName}, " +
//        " last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
//    public int update(User user);

}
