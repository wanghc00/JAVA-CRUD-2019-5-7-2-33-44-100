/*
 * Copyright (C), 1992-2019
 * Package com.employee.crud.data 
 * FileName: EmployeeData.java
 * Author:   wang-hc
 * Date:     2019年8月1日 下午4:52:26
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月1日下午4:52:26                     1.0                  
 *===============================================================================================
 */
package com.employee.crud.data;

import com.employee.crud.entity.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月1日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class EmployeeData {
    public static List<Employee> employeeData() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(0, "小明", 20, "男"));
        employeeList.add(new Employee(1, "小红", 19, "女"));
        employeeList.add(new Employee(2, "小智", 15, "男"));
        employeeList.add(new Employee(3, "小钢", 16, "女"));
        employeeList.add(new Employee(4, "小夏", 15, "女"));
        return employeeList;
    }
}
