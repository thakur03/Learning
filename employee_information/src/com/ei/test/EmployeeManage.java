package com.ei.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ei.database.ConnectionManage;

public class EmployeeManage {
	//create sql query for select all employee
	private static final String SQL_QUERY = "select e.id, e.name, e.salary, e.address, e.dob, d.dept_id, d.dept_name, "
			+ "d.dept_description from employee e join emp_dept ed on e.id = ed.emp_id "
			+ "join department d on d.dept_id = ed.dept_id ;";
	
	Connection con = ConnectionManage.getConnection();
	Statement statement = null;
	
	//create method for retrieving employee details
	public List<Employee> viewAllEmployee(){
		List<Employee> employeeList = new ArrayList<>();
		
		try {
			statement = con.createStatement();
		} catch (SQLException e1) {
			e1.getMessage();
		}
		try {
			ResultSet rs = statement.executeQuery(SQL_QUERY);
			
			while(rs.next()){
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setAddress(rs.getString("address"));
				employee.setSalary(rs.getString("salary"));
				employee.setDob(rs.getDate("dob"));
				Department department = new Department();
				department.setId(rs.getInt("dept_id"));
				department.setName(rs.getString("dept_name"));
				department.setDesc(rs.getString("dept_description"));
				employee.setDepartment(department);
				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		
		return employeeList;
		}
}
