package DAO;

import java.util.ArrayList;
import java.util.List;

public class EmloyeeDAOImpl implements EmployeeDAO{
	
	List<Employee> employees;
	
	public EmloyeeDAOImpl(){
		
		employees = new ArrayList<Employee>();
		Employee employee1 = new Employee(1,"Taras", 21, "male", "taras", "123456");
		Employee employee2 = new Employee(2,"Petro", 35, "male", "petro", "654321");
		Employee employee3 = new Employee(3,"45", 35, "male", "petro", "654321");
		Employee employee4 = new Employee(4,"85", 35, "male", "petro", "654321");
		Employee employee5 = new Employee(5,"777", 35, "male", "petro", "654321");
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
	}
	//retrieve list of employees from database
	public List<Employee> getAllEmployes() {
		return employees;
	}



	public void updateEmployee(Employee employee) {
		employees.get(employee.getEmployeeId()).setName(employee.getName());
		employees.get(employee.getEmployeeId()).setAge(employee.getAge());
		employees.get(employee.getEmployeeId()).setGender(employee.getGender());
		employees.get(employee.getEmployeeId()).setLogin(employee.getLogin());
		employees.get(employee.getEmployeeId()).setPassword(employee.getPassword());
	}

	public void deleteEmployee(Employee employee) {
		employees.remove(employee.getEmployeeId());
		
	}

	public Employee getEmployee(int employeeId) {
		return employees.get(employeeId);
	}

}
