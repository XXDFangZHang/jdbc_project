package com.xdf.dao.user;

import com.xdf.bean.Users;
import com.xdf.util.BaseDao;
import com.xdf.util.PageUtil;

import java.io.Serializable;
import java.util.List;

/**
 * 真正执行增删改操作
 */
public class UserDaoImpl  extends BaseDao implements UserDao {
    /**
     * 注册功能
     */
    @Override
    public int add(Users users) {
        String sql="INSERT INTO news_user(userName,`password`,email,userType) VALUES(?,?,?,?)";
        Object[] params={users.getUserName(),users.getPassword(),users.getEmail(),users.getUserType()};
        return executeUpdate(sql,params);
    }

    @Override
    public int deleteByCondition(Serializable id) {
        return 0;
    }

    @Override
    public int update(Users users) {
        return 0;
    }

    @Override
    public Users findByCondition(Serializable id) {
        return null;
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public int findRownum() {
        return 0;
    }

    @Override
    public List<Users> findAllByPage(PageUtil util, Object... params) {
        return null;
    }
}
