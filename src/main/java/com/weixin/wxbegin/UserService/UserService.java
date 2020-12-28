package com.weixin.wxbegin.UserService;


import com.weixin.wxbegin.UserMapper.UserMapper;
import com.weixin.wxbegin.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User queryUserById(long id){
        return userMapper.queryUserById(id);
    }

}
