package com.example.Repository;

import com.example.Mapper.departmentmapper;
import com.example.Model.Department;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
public class DepartmentRepo {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public int insert(Department dept){
      return jdbcTemplate.update("insert into department values(?,?,?)",new Object[]{dept.getId(),dept.getName(),dept.getStartdate()});
    }
    public int count(){
        return jdbcTemplate.queryForObject("select count(*) from department",Integer.class);
    }
    public int delete(int id){
        return jdbcTemplate.update("delete from department where id=?",new Object[]{id});

    }
    public Department getDepartmentbyId(int id){

       return jdbcTemplate.queryForObject("select * from department where id=?",new Object[]{id},(resultset, rowNum) ->{Department dept=new Department();
        dept.setId(resultset.getInt("id"));dept.setName(resultset.getString("Dept_name"));dept.setStartdate(resultset.getDate("start_date"));
            return dept;
        } );
    }
    public List<Department> getAllDepartment(){
        return jdbcTemplate.query("select * from department",new departmentmapper());
    }




}
