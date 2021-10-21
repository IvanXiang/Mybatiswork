package com.example.mybatiswork.mapper;


import com.example.mybatiswork.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    User Sel(int id);
}