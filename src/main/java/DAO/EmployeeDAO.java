package DAO;

import java.util.List;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployes();
	public Employee getEmployee();
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	

}
