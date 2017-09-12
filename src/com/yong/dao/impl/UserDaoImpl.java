
package com.yong.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yong.dao.UserDao;
import com.yong.mapper.UserMapper;
import com.yong.model.User;

@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user)
    {
        userMapper.saveUser(user);
    }

    @Override
    public User findUserById(int id)
    {
        User user = userMapper.selectUserById(id);
        return user;
    }

    @Override
    public List<User> query()
    {
        List<User> list = userMapper.query();
        return list;
    }

}
