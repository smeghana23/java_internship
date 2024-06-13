package com.pace.emp.crud.main;
import com.pace.emp.crud.bean.Employee;
import com.pace.emp.crud.dao.EmployeeCrud;
public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee kumar = new Employee(1234,"Kumar",3452.90f);
		Employee prerana = new Employee(1235,"prerana",4567.90f);
		Employee anirudh = new Employee(1236,"Anirudh",3752.90f);
		
		EmployeeCrud empCrud = new EmployeeCrud();
		//send emp objects to addEmployee method
		empCrud.addEmployee(anirudh);
		empCrud.addEmployee(prerana);
		empCrud.addEmployee(kumar);
		//display employees details
		System.out.println("Original emp list");
		empCrud.showEmpList();
		//deleting
		empCrud.deleteEmployee(1234);
		System.out.println("EmpList after deletion");
		empCrud.showEmpList();
		//updation
		empCrud.updateEmployee();
		System.out.println("EmpList after updation");
		empCrud.showEmpList();
	}

}
