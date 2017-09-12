
package com.yong.mapper;

import java.util.List;

import com.yong.model.User;

/**
 * @项目名称：ssm01
 * @类名称：UserMapper
 * @类描述：用户信息操作数据库接口
 * @创建人：YUY
 * @创建时间：2017年9月11日 下午4:23:47
 * @修改人：YUY
 * @修改时间：2017年9月11日 下午4:23:47
 * @修改备注：
 * @version
 */
public interface UserMapper
{
    /**
     * 方法描述：保存用户信息接口
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:08:48
     * @param user
     */
    public void saveUser(User user);

    /**
     * 方法描述：根据id查找用户信息接口
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午10:07:08
     * @param userId
     * @return
     */
    public User selectUserById(int userId);

    /**
     * 方法描述：用户列表
     * 
     * @author YUY
     * @创建时间：2017年9月12日 上午11:06:07
     * @return
     */
    public List<User> query();
}
