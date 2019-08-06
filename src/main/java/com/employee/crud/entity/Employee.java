/*
 * Copyright (C), 1992-2019
 * Package com.employee.crud.data 
 * FileName: Employee.java
 * Author:   wang-hc
 * Date:     2019年8月1日 下午4:43:09
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月1日下午4:43:09                     1.0                  
 *===============================================================================================
 */
package com.employee.crud.entity;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月1日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Employee() {}
    
    public Employee(int id,String name,int age,String gender) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Employee{" +
        "id=" + id +
        ", name='" + name +
        ", age='" + age +
        ", gender='" + gender +
        '\'' +'}';
    }
}
