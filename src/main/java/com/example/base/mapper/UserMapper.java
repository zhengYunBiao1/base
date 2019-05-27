package com.example.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.base.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 67414 on 2019/5/27.
 */
public interface UserMapper extends BaseMapper<User> {

//    @Select("SELECT * FROM user")
//    List<User> getAll();
}
