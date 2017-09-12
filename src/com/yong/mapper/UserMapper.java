
package com.yong.mapper;

import com.yong.model.User;

/**
 * @项目名称：ssm01
 * @类名称：UserMapper
 * @类描述：
 * @创建人：YUY
 * @创建时间：2017年9月11日 下午4:23:47
 * @修改人：YUY
 * @修改时间：2017年9月11日 下午4:23:47
 * @修改备注：
 * @version
 */
public interface UserMapper
{
    public User selectUserById(int userId);

}
