package com.pace.emp.crud.dao;

import java.util.ArrayList;

import com.pace.emp.crud.bean.Employee;

public class EmployeeCrud {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	//adding
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	//displaying
	public void showEmpList() {
		for(Employee emp : empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("=======================");
		}
	}
	//update employee salary by 10%
	public void updateEmployee() {
		for(Employee emp : empList) {
			float salary = emp.getSalary();
			salary = salary + salary * 0.10f;
			emp.setSalary(salary);
			System.out.println("Salary has been updated");
		}
	}
	//deleting
	//Before deleting the object ensure that object is avaliable
	//if the object is not avaliable provide an relevant  message to end user
	//this is known as determination of the avaliability 
	//isAvaliable is a determination variable
	public void deleteEmployee(int id) {
		boolean isAvaliable = false;//boolean variable should start with either is or has
		for(Employee emp : empList) {
			if(id == emp.getId()) {
				empList.remove(emp);
				isAvaliable = true;
				break;
			}
		}
		if(isAvaliable == true) {
			System.out.println("Employee with id " + id + " has been successfully deleted");
		}else {
			System.out.println("Employee with id " + id + " is unavaliable");
		}
	}

}
