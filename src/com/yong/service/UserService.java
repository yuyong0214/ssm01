
package com.yong.service;

import java.util.List;

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

    /**
     * 方法描述：保存用户方法
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:02:43
     * @param user
     */
    public void save(User user)
    {
        userDao.save(user);
    }

    /**
     * 方法描述：根据id找到用户信息
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:03:14
     * @param id
     * @return
     */
    public User findById(Integer id)
    {
        User user = userDao.findUserById(id);
        return user;
    }

    /**
     * 方法描述：用户列表
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午11:04:21
     * @return
     */
    public List<User> query()
    {
        return userDao.query();
    }
}
