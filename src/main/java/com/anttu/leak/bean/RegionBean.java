package com.anttu.leak.bean;

import lombok.Data;

import java.util.List;

/**
 * 描述
 *
 * @ClassName：RegionBean
 * @Description：地区bean
 * @author：Anttu
 * @Date：6/9/2019 21:06
 */
@Data
public class RegionBean
{
    private String id;
    private String name;
    private String no;
    private String level;
    private List<RegionBean> list;
}
