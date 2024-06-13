package com.pace.emp.crud.dao;

import java.util.HashSet;
import com.pace.emp.crud.bean.EmployeeSet;

public class EmployeeSetCrud {
	HashSet<EmployeeSet> empSet = new HashSet<EmployeeSet>();
	public void addEmployee(EmployeeSet emp) {
		empSet.add(emp);
	}
	//displaying
	public void showEmpList() {
		for(EmployeeSet emp : empSet) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("=======================");
		}
	}
	//update employee salary by 10%
	public void updateEmployee() {
		for(EmployeeSet emp : empSet) {
			float salary = emp.getSalary();
			salary = salary + salary * 0.10f;
			emp.setSalary(salary);
			System.out.println("Salary has been updated");
		}
	}
	//deleting
	public void deleteEmployee(int id) {
		boolean isAvaliable = false;//boolean variable should start with either is or has
		for(EmployeeSet emp : empSet) {
			if(id == emp.getId()) {
				empSet.remove(emp);
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
