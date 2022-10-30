package com.example.Repository;

import com.example.Mapper.EmployeeMapper;
import com.example.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static java.time.chrono.JapaneseEra.values;

@Component
public class EmployeeRepo {
    @Autowired //inject object of jdbctemplate in class employeeRepo;;;
    private  JdbcTemplate jdbcTemplate;
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public  int getcount(){

        return jdbcTemplate.queryForObject("select count(*) from employee",Integer.class);
    }
    public  List<Employee> getAllEmployee(){
        return jdbcTemplate.query("select * from employee ",new EmployeeMapper());
    }

    public  Employee findbyId(int id){


        return jdbcTemplate.queryForObject("select * from employee where id =?",new Object[]{id},new EmployeeMapper());

    }
    public int insert(Employee emp){
       return  jdbcTemplate.update("INSERT INTO employee(id, first_name, address, salary) values (?,?,?,?) ",new Object[]{emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()});
    }

    public  int deleteEmployee(int id){
     return jdbcTemplate.update("delete from employee where id=?",new Object[]{id});
    }
    public void updateEmployee(Employee emp){

    }

}
