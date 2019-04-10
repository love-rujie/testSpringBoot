package com.example.springtest.Bean;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface TestDao {

    @Select("select * from m_sbrc_inf;")
    public Map<String,Object> find();

}
