package com.zcm.dao.impl;

import com.zcm.dao.UserLoginDao;

/**
 * Created by zhangpeijie on 2018/11/9.
 */
public class UserLoginDaoImpl implements UserLoginDao {

    @Override
    public boolean login(String userName, String password) {

        // 假设我们现在访问的是数据库
        if ( userName.equals("zcm") && password.equals("123")){
            return true;
        }
        return false;
    }
}
