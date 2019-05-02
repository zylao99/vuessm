package com.itheima.controller;

import com.itheima.daomain.User;
import com.itheima.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Userservice userservice;

   @RequestMapping("/findAll")
    public List<User> findAll(){
        return userservice.findAll();
    }

    /**
     * 根据id 查询
     * @param
     */
    @RequestMapping("/findById")
    public  User findById(int id){
        return userservice.findById(id);
    }


    @RequestMapping("/update")
    public void updateUser(@RequestBody User user){
         userservice.updateUser(user);
    }

}
