package com.itheima.dao;

import com.itheima.daomain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id = #{id}")
    public User findById(int id);

    @Update("update user set username=#{username},password=#{password} ,age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    public void updateUser(User user );
}
