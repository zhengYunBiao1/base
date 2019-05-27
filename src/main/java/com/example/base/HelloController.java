package com.example.base;

import com.example.base.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 67414 on 2019/5/10.
 */
@Controller
public class HelloController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value="/hello")
    public String hello(ModelMap modelMap){
//        userRepository.save(new User("zyb","zyb","123456",30));
//        List<User> users = userRepository.findAll();
        List<User> users = userMapper.selectList(null);
        modelMap.put("users",users);
        return "hello";
    }
}
