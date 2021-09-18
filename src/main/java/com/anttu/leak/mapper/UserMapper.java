package com.anttu.leak.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.anttu.leak.bean.UserVo;
import com.anttu.leak.entity.User;

/**
 * 描述
 *
 * @ClassName：UserMapper
 * @Description：用户mapper
 * @author：Anttu
 * @Date：20/8/2021 10:08
 */
@Repository
public interface UserMapper {
    List<UserVo> queryAll();

    User selectByPrimaryKey(Long id);

    List<UserVo> selectBySex(@Param("sex") Integer sex);

    List<UserVo> selectByAccount(@Param("account") String name);

    int insert(UserVo userVo);

    int updateName(@Param("name") String name, @Param("id") Integer id);
}
