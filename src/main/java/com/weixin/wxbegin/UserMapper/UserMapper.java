package com.weixin.wxbegin.UserMapper;

import com.weixin.wxbegin.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User queryUserById(long id);
}
