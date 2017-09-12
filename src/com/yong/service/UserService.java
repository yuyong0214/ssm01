
package com.yong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.dao.UserDao;
import com.yong.model.User;

/**
 * @项目名称：ssm01
 * @类名称：UserService
 * @类描述：
 * @创建人：YUY
 * @创建时间：2017年9月11日 下午5:27:54
 * @修改人：YUY
 * @修改时间：2017年9月11日 下午5:27:54
 * @修改备注：
 * @version
 */
@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public User findById(Integer id)
    {
        User user = userDao.findUserById(id);
        return user;
    }
}
