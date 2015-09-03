package DAO;

public class TestDAO {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmloyeeDAOImpl();
		
		//print all employees
		for (Employee employee : employeeDAO.getAllEmployes()) {
			
			System.out.println("Employee ID : " +employee.getEmployeeId()+
					", Name: "+employee.getName()+
					", Age: "+employee.getAge()+
					", Gender: "+employee.getGender()
			);
		}
		//update employee
			Employee employee3 = employeeDAO.getAllEmployes().get(0);
			employee3.setGender("female");
			employee3.setName("ANNA");
			employeeDAO.updateEmployee(employee3);
			System.out.println("Update of employee data completed");
			System.out.println("Employee ID : " +employee3.getEmployeeId()+
					", Name: "+employee3.getName()+
					", Age: "+employee3.getAge()+
					", Gender: "+employee3.getGender()
			);
		
		//get employee
			Employee employee = employeeDAO.getEmployee(0);
			System.out.println(employee.getName());
			
			Employee employee67 = employeeDAO.getEmployee(1);
			employeeDAO.deleteEmployee(employee67);
			
			for (Employee employee1 : employeeDAO.getAllEmployes()) {
				
				System.out.println("Employee ID : " +employee1.getEmployeeId()+
						", Name: "+employee1.getName()+
						", Age: "+employee1.getAge()+
						", Gender: "+employee1.getGender()
				);
			}
			
	}
}

