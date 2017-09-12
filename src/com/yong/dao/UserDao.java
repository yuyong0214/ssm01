
package com.yong.dao;

import java.util.List;

import com.yong.model.User;

public interface UserDao
{
    /**
     * 方法描述：保存方法
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:06:08
     * @param user
     */
    public void save(User user);

    /**
     * 方法描述：根据id查找用户信息
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:05:44
     * @param id
     * @return
     */
    public User findUserById(int id);

    /**
     * 方法描述：用户列表
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午11:06:07
     * @return
     */
    public List<User> query();
}
