
class Employee extends Person {
	
	private String department;
	private double salary;
	
	public void setDepartment(String d) {
		department = d;
	}
	public String getDepartment() {
		return department;
	}
	public void setSalary(double s) {
		salary = s;
	}
	public double getSalary() {
		return salary;
	}
	
	void callEmployee(String name, String contactNum, double salary, String department) {
		setName(name);
        setContactNum(contactNum);       
        setSalary(salary);
        setDepartment(department);
        
        System.out.println("----------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Salary: " + getSalary());
        System.out.println("Departemnt: " + getDepartment());
                    
	}
	
        
        
}
