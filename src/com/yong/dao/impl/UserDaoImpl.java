
package com.yong.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yong.dao.UserDao;
import com.yong.mapper.UserMapper;
import com.yong.model.User;

@Component
public class UserDaoImpl implements UserDao
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id)
    {
        User user = userMapper.selectUserById(id);
        return user;
    }

}
