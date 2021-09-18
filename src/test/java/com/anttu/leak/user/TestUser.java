package com.anttu.leak.user;

import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;

import com.anttu.leak.BaseTest;
import com.anttu.leak.bean.UserVo;
import com.anttu.leak.service.TestQuery;

/**
 * 描述
 *
 * @ClassName：TestUser
 * @Description：
 * @author：Anttu
 * @Date：23/8/2021 14:25
 */
public class TestUser extends BaseTest {

    @Resource
    private TestQuery testQuery;

    @Test
    public void TestInsertUser (){
        String account = "test";
        String password = "password";
        String name = "张三";
        int sex = 0;
        String company = "company";

        for (int i = 0; i < 100; i++) {
            UserVo userVo = new UserVo();
            userVo.setAccount(account + i);
            userVo.setPassword(password + i);
            userVo.setName(name + i);
            userVo.setSex(new Random().nextInt(1));
            userVo.setCompany(company + i);

            testQuery.insert(userVo);
        }
    }
}
