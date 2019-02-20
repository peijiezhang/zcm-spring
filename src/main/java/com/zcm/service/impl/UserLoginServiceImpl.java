package com.zcm.service.impl;

import com.zcm.dao.UserLoginDao;
import com.zcm.service.UserLoginService;

/**
 * Created by zhangpeijie on 2018/11/9.
 */
public class UserLoginServiceImpl implements UserLoginService {

    UserLoginDao userLoginDao;

    public UserLoginServiceImpl(){
        System.out.println(" constructor was called");
    }

    @Override
    public boolean login(String userName, String password) {
       return userLoginDao.login( userName , password);
    }


    public UserLoginDao getUserLoginDao() {
        return userLoginDao;
    }

    public void setUserLoginDao(UserLoginDao userLoginDao) {
        this.userLoginDao = userLoginDao;
    }
}
