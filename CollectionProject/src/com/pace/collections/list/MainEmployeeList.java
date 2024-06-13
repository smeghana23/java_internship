package com.pace.collections.list;
import java.util.ArrayList;
public class MainEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarySum=0;
		Employee sowmya = new Employee(1256, "Sowmya", 108653.90f);
		Employee sai = new Employee(1257, "Sai", 176432.90f);
		Employee manchi = new Employee(1258, "Manchi", 109053.90f);
		
		ArrayList<Employee>empList = new ArrayList<Employee>();
//		add employee objects
		empList.add(sowmya);
		empList.add(sai);
		empList.add(manchi);
		
		for(Employee emp : empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		
		for(Employee emp : empList) {
			 salarySum += emp.getSalary();
		}
		System.out.println("Sum of Salaries : " +salarySum);

	}

}
