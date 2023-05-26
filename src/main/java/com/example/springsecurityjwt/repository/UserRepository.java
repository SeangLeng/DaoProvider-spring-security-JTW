package com.example.springsecurityjwt.repository;

import com.example.springsecurityjwt.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {
    @Select("select * from user_tb where email like #{email}")
    UserModel getAllUser(String email);
}
