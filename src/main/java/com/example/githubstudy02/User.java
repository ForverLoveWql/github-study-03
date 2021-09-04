package com.example.githubstudy02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "user1")
public class User {
     private  String name;
     private  String sex;
     private  int age;
     private List<Object> list;
     private Map<Object,Object> map;
     private Date time;

    public User() {
    }

    public User(String name, String sex, int age, List<Object> list, Map<Object, Object> map, Date time) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.list = list;
        this.map = map;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", map=" + map +
                ", time=" + time +
                '}';
    }
}
