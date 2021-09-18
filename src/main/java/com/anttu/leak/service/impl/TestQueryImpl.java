package com.anttu.leak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anttu.leak.bean.UserVo;
import com.anttu.leak.entity.User;
import com.anttu.leak.mapper.UserMapper;
import com.anttu.leak.service.TestQuery;

/**
 * 描述
 *
 * @ClassName：TestQueryImpl
 * @Description：测试查询user impl
 * @author：Anttu
 * @Date：20/8/2021 10:15
 */
@Service
public class TestQueryImpl implements TestQuery {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserVo> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public UserVo selectByPrimaryKey(Long id) {
        User user = userMapper.selectByPrimaryKey(id);

        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setAccount(user.getAccount());
        userVo.setPassword(user.getPassword());
        userVo.setName(user.getName());
        userVo.setSex(user.getSex());
        userVo.setCompany(user.getCompany());

        return userVo;
    }

    @Override
    public List<UserVo> selectBySex(Integer sex) {
        return userMapper.selectBySex(sex);
    }

    @Override
    public List<UserVo> selectByAccount(String name) {
        return userMapper.selectByAccount(name);
    }

    @Override
    public boolean insert(UserVo userVo) {
        int result = userMapper.insert(userVo);
        return result > 0;
    }

    @Override
    public boolean updateName(String name, Integer id) {
        int result = userMapper.updateName(name, id);
        return result > 0;
    }
}
