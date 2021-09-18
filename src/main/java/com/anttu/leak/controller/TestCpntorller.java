package com.anttu.leak.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anttu.leak.bean.UserVo;
import com.anttu.leak.service.TestQuery;

/**
 * 描述
 *
 * @ClassName：TestCpntorller
 * @Description：
 * @author：Anttu
 * @Date：23/8/2021 13:51
 */
@RestController
@RequestMapping("/test")
public class TestCpntorller {

    @Resource
    private TestQuery testQuery;

    @GetMapping("/demo")
    public List<UserVo> test(){
        return testQuery.queryAll();
    }

    @GetMapping("/demo1")
    public UserVo test1 (@RequestParam("userId") Long userId) {
        return testQuery.selectByPrimaryKey(userId);
    }

    @GetMapping("/demo2")
    public List<UserVo> test2(@RequestParam("sex") Integer sex){
        return testQuery.selectBySex(sex);
    }

    @GetMapping("/demo3")
    public List<UserVo> test3(@RequestParam("account") String account) {
        return testQuery.selectByAccount(account);
    }

    @GetMapping("/demo4")
    public boolean test4 (@RequestParam("name") String name, @RequestParam("id") Integer id) {
        return testQuery.updateName(name, id);
    }
}
