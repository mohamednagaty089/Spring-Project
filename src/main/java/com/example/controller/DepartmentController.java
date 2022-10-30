package com.example.controller;

import com.example.Model.Department;
import com.example.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
@Autowired
    DepartmentRepo departmentRepo;

   @GetMapping("/count")
    public int count(){
    return departmentRepo.count();
}

   @GetMapping("/insert")
    public int insert(Department dept){
       return departmentRepo.insert(dept);
   }
   @GetMapping("/delete/{id}")
    public int deleteDepartment(@PathVariable int id){

       return departmentRepo.delete(id);
   }
   //dependency injection object of class A contain two object S,D ==>A inject two object S,D
   @GetMapping("/FindDepartmentById/{id}")
    public Department getDepartmentbyId(@PathVariable int id){
       return departmentRepo.getDepartmentbyId(id);
   }
    @GetMapping("/getAlldepartments")
    public List<Department> getAllDepartments(){
        return departmentRepo.getAllDepartment();
    }
    @GetMapping("/factorial/{element}")
    public long getfactorial(@PathVariable long element){
       if(element==1)return 1;
       return element*getfactorial(--element);
    }


}
