package DAO;

public class Employee {
	private int employeeId;
	private String name;
	private int age;
	private String gender;
	private String login;
	private String password;


	public Employee( int employeeId, String name, int age, String gender, String login, String password) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.login = login;
		this.password = password;
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	

}
