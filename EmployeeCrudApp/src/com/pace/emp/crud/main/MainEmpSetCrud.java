package com.pace.emp.crud.main;
import com.pace.emp.crud.bean.EmployeeSet;
import com.pace.emp.crud.dao.EmployeeSetCrud;
public class MainEmpSetCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSet kumar = new EmployeeSet(1234,"Kumar",3452.90f);
		EmployeeSet prerana = new EmployeeSet(1235,"prerana",4567.90f);
		EmployeeSet anirudh = new EmployeeSet(1236,"Anirudh",3752.90f);
		
		EmployeeSetCrud empCrud = new EmployeeSetCrud();
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
		
		empCrud.updateEmployee();
		System.out.println("EmpList after updation");
		empCrud.showEmpList();
	}
}

