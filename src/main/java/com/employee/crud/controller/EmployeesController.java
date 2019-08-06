/*
 * Copyright (C), 1992-2019
 * Package com.employee.crud 
 * FileName: Employees.java
 * Author:   wang-hc
 * Date:     2019年8月1日 上午9:42:42
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月1日上午9:42:42                     1.0                  
 *===============================================================================================
 */
package com.employee.crud.controller;

import com.employee.crud.entity.Employee;
import com.employee.crud.service.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmployeesController {
    
    private EmployeeService employeeService = new EmployeeService();

    @GetMapping("/getAllEmployee")
    public ResponseEntity getAllEmployee() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);;
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/updateEmployee/{employeeId}")
    public ResponseEntity updateEmployeeById(@PathVariable int employeeId, @RequestBody Employee employee){
        try {
            employeeService.updateEmployeeById(employeeId, employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("deleteEmployee/{employeeId}")
    public ResponseEntity deleteEmployeeById(@PathVariable int employeeId){
        employeeService.deleteByEmployeeId(employeeId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
