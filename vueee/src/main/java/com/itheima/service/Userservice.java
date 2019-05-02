package com.itheima.service;

import com.itheima.dao.IUserDao;
import com.itheima.daomain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Userservice  {

    @Autowired
    private IUserDao iUserDao;

    public List<User> findAll(){
        return iUserDao.findAll();
    }

    public User findById(int id){
        return iUserDao.findById(id);
    }


    public void updateUser(User user){
           iUserDao.updateUser(user);
    }
}
