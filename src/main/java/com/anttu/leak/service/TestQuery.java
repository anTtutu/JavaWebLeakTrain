package com.anttu.leak.service;

import java.util.List;

import com.anttu.leak.bean.UserVo;

/**
 * 描述
 *
 * @ClassName：TestQuery
 * @Description：测试查询user
 * @author：Anttu
 * @Date：20/8/2021 10:14
 */
public interface TestQuery {
    List<UserVo> queryAll();

    UserVo selectByPrimaryKey(Long id);

    List<UserVo> selectBySex(Integer sex);

    List<UserVo> selectByAccount(String name);

    boolean insert(UserVo userVo);

    boolean updateName(String name, Integer id);
}
