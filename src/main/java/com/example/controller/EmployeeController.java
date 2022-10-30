package com.example.controller;

import com.example.Model.Employee;
import com.example.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepo emprepo;

    @GetMapping("countEmployee")
    public int countEmployee(){
       return emprepo.getcount();
    }
    @GetMapping("print")
     public int print(){
        return 20;
    }
    @GetMapping("FindEmployeebyId/{id}")
    public Employee findEmployeebyId(@PathVariable int id){

        return emprepo.findbyId(id);
    }
    @GetMapping("getAllEmployee")
    public List<Employee> getAllEmployee(){
        return emprepo.getAllEmployee();
    }
    @GetMapping("insert")
    public int insert(int id,String name,int salary,String address){
        Employee emp=new Employee(id,name,salary,address );
     return emprepo.insert(emp);
    }
    @GetMapping("/deleteemployee/{id}")
    public int deleteEmployee(@PathVariable int id){
        return emprepo.deleteEmployee(id);
    }


}
