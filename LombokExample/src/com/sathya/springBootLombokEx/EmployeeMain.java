package com.sathya.springBootLombokEx;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee emp=new Employee(101,"Ratan",7000);
		System.out.println(emp);
		
		Employee emps=new Employee();
		emps.setEmpId(102);
		emps.setEmpName("Sathya");
		emps.setEmpSalary(6000);
		System.out.println(emps.getEmpId()+" "+emps.getEmpName()+" "+emps.getEmpSalary());*/
		
		Employee emp=Employee.builder()
				.empId(103)
				.empName("Ratan")
				.empSalary(4000)
				.build();
		System.out.println(emp);
		
		/*Employee emp=new Employee();
		emp.setEmpId(1001);
		emp.setEmpName(null);
		emp.setEmpSalary(20000);*/
		
		

	}

}
