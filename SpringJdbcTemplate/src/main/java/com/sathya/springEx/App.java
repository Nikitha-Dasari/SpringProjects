package com.sathya.springEx;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringJdbcConfiguration.class);
        EmployeeDAOImpl empDao=context.getBean("employeeDAOImpl",EmployeeDAOImpl.class);
        
        //Creating the table
        //int count1=empDao.createTable();
        //System.out.println("Table created "+count1);
        
        //Inserting the values
        //int res=empDao.save(new Employee(2,"John",8900.0f));
        //System.out.println("Data inserted successfully "+res);
        
        //Find By id
        Employee emps=empDao.findById(1);
        System.out.println("Employee Details "+emps);
        
        //Find all the employees
        List<Employee> emp=empDao.findAll();
        for(Employee e:emp)
        	System.out.println(e);
        
        //Deleting by id
//        int res=empDao.deleteById(5);
//        System.out.println("Data deleted successfully "+res);
        
        //DeleteAll
        //int count=empDao.deleteAll();
        //System.out.println("Total data deleted successfully "+count);
        
        //Update by salary
        //int res=empDao.updateBySalary(4000,500);
        //System.out.println("Updated successfully "+res);
        
        //Drop the table
        //int count2=empDao.dropTable();
        //System.out.println("Table dropped "+count2);
        
        //saving the list of employees
//        List<Employee> al=new ArrayList<Employee>();
//        al.add(new Employee(5,"Rohit",8000.0f));
//        al.add(new Employee(6,"Rahul",7000.0f));
//        int count3=empDao.saveAll(al);
//        System.out.println("Inserted values successfully "+count3);
    }
}
