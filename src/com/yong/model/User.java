
package com.yong.model;

import org.springframework.stereotype.Component;

/**
 * @项目名称：ssm01
 * @类名称：User
 * @类描述：
 * @创建人：YUY
 * @创建时间：2017年9月11日 下午4:20:00
 * @修改人：YUY
 * @修改时间：2017年9月11日 下午4:20:00
 * @修改备注：
 * @version
 */
@Component
public class User
{
    private Integer userId;

    private String userName;

    private int userAge;

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getUserAge()
    {
        return userAge;
    }

    public void setUserAge(int userAge)
    {
        this.userAge = userAge;
    }

    @Override
    public String toString()
    {
        return "User [userId=" + userId + ", userName=" + userName
                + ", userAge=" + userAge + "]";
    }
}