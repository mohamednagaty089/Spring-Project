package com.example.Mapper;

import com.example.Model.Department;
import org.springframework.jdbc.core.RowMapper;


import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class departmentmapper implements RowMapper<Department> {

    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Department(rs.getString("Dept_name"),rs.getDate("start_date"));
    }
}
