package com.zcm.service;

import com.zcm.dao.impl.UserLoginDaoImpl;
import com.zcm.service.impl.UserLoginServiceImpl;
import org.junit.Test;

/**
 * Created by zhangpeijie on 2018/11/9.
 */
public class LoginServiceTest {


    @Test
    public void testLogin(){

        UserLoginServiceImpl userLoginService = new UserLoginServiceImpl();

        userLoginService.setUserLoginDao( new UserLoginDaoImpl());

        boolean loginResult = userLoginService.login("zcm","123456");

        System.out.println(loginResult);
    }

}
