/*
 * Copyright (C), 1992-2019
 * Package com.employee.crud.service 
 * FileName: EmployeeService.java
 * Author:   wang-hc
 * Date:     2019年8月1日 下午4:51:37
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月1日下午4:51:37                     1.0                  
 *===============================================================================================
 */
package com.employee.crud.service;

import com.employee.crud.data.EmployeeData;
import com.employee.crud.entity.Employee;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月1日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
@Service
public class EmployeeService {
    private List<Employee> employeeData = EmployeeData.employeeData();
    
    public List<Employee> getAllEmployees() {
        return employeeData;
    }
    
    public void addEmployee(Employee employee) {
        employeeData.add(employee);
    }
    
    public void deleteByEmployeeId(int id) {
        deleteById(id);
    }
    
    public void updateEmployeeById(int employeeId, Employee employee) throws Exception{
        Employee employeeInfo = getEmployeeById(employeeId);
        if (employeeInfo!=null) {
//            employeeInfo.setId(employee.getId());
//            employeeInfo.setName(employee.getName());
//            employeeInfo.setAge(employee.getAge());
//            employeeInfo.setGender(employee.getGender());
            save(employee);
        }else {
            throw new Exception();
        }
    }
    
    private Employee getEmployeeById(int employeeId){
        Employee resultEmployee = new Employee();
        for (Employee employee : employeeData) {
            if (employeeId==employee.getId()) {
                resultEmployee = employee;
                break;
            }
        }
        return resultEmployee;
    }    
    
    private void save(Employee employee) {
        int index = -1;
        for (Employee employee1 : employeeData) {
            if (employee1.getId()==employee.getId()) {
                index=employee.getId();
            }
        }
        if (index!=-1) {
            employeeData.set(index, employee);
        }else {
            employeeData.add(employee);
        }
    }

    private void deleteById(int id){
        Employee employee = getEmployeeById(id);
        employeeData.remove(employee);
    }
    
}
