package com.example.Config;

import com.example.Model.Department;
import com.example.Model.Employee;
import com.example.Repository.DepartmentRepo;
import com.example.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class StartUpProject implements CommandLineRunner {

   @Autowired
   EmployeeRepo employeeRepo;
    @Autowired
   DepartmentRepo departmentRepo;
    @Override
    public void run(String... args) throws Exception {
       //System.out.println(employeeRepo.insert(new Employee(90,"mostafa",9000,"elbagor")));
       // System.out.println(employeeRepo.deleteEmployee(15));
        List<Employee> employeeList=employeeRepo.getAllEmployee();
        for(Employee ep:employeeList){
            System.out.println("name : "+ep.getName()+" salary : "+ep.getSalary()+" address : "+ep.getAddress());
        }
         Department dept=new Department();
        dept=departmentRepo.getDepartmentbyId(51);
         System.out.println("name  : "+dept.getName()+" , start date "+dept.getStartdate());
         List<Department> departments=departmentRepo.getAllDepartment();
        for(Department p:departments){
            System.out.println("name : "+p.getName()+" ,start_date : "+p.getStartdate());
        }
//        dept.setId(90);
//        dept.setName("JJJ");
//        dept.setStartdate(new Date());
//        departmentRepo.insert(dept);

    }
}
