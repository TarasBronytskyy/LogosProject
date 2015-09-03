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

	}

}
