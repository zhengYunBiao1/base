package com.example.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 67414 on 2019/5/10.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String loginName;
    private String password;
    private int age;

    public User(){}

    public User(String name,String loginName,String password,int age){

        this.name=name;
        this.loginName=loginName;
        this.password=password;
        this.age=age;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
