package com.sathya.springEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private EmployeeRowMapper rowMapper;
		
		//Create the table
		@Override
		public int createTable() {
			String sql="create table empsdata(id int primary key,name varchar(30),salary float)";
			int emps=jdbcTemplate.update(sql);
			return 0;
		}
		
		//Insert the values
		@Override
		public int save(Employee emp) {
			String sql="insert into emp_data values(?,?,?)";
			int emps=jdbcTemplate.update(sql,emp.getId(),emp.getName(),emp.getSalary());
			return emps;
		}
		
		//Save List of employees
		@Override
		public int saveAll(List<Employee> emp) {
			int count=0;
			String sql="insert into emp_data values(?,?,?)";
			for(Employee emps:emp)
				count=jdbcTemplate.update(sql,emps.getId(),emps.getName(),emps.getSalary());
			return count;
		}
		
		//Find by ID
		@Override
		public Employee findById(int id) {
			String sql = "select * from emp_data where id = ?";
		    Employee emps= jdbcTemplate.queryForObject(sql,new Object[]{id},rowMapper);
		    return emps;
		}
		
		//Display all employees
		@Override
		public List<Employee> findAll() {
			// TODO Auto-generated method stub
			String sql="select * from emp_data";
			List<Employee> emp=jdbcTemplate.query(sql,rowMapper);
			return emp;
		}
		
		//Delete by ID
		@Override
		public int deleteById(int id) {
			String sql="delete from emp_data where id=?";
			int emps=jdbcTemplate.update(sql,id);
			return emps;
		}
		
		@Override
		public int deleteAll() {
			String sql="delete * from emp_data";
			int emps=jdbcTemplate.update(sql);
			return emps;
		}
		
		//Update by Salary
		@Override
		public int updateBySalary(float curSalary, float newSalary) {
			String sql="update emp_data set salary=salary+? where salary>?";
			int emps=jdbcTemplate.update(sql,newSalary,curSalary);
			return emps;
		}
		
		//Drop the table
		@Override
		public int dropTable() {
			String sql="drop table empsdata";
			int emps=jdbcTemplate.update(sql);
			return emps;
		}

}
