package com.sathya.springEx;

import java.util.List;

public interface EmployeeDAO {
	
	public int createTable();
	
	public int save(Employee emp);
	
	public int saveAll(List<Employee> emp);
	
	public Employee findById(int id);
	
	public List<Employee> findAll();
	
	public int deleteById(int id);
	
	public int deleteAll();
	
	public int updateBySalary(float curSalary,float newSalary);
	
	public int dropTable();
 }