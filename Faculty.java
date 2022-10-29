
class Faculty extends Employee {
	private boolean status;
	public boolean isRegular;
	
	boolean status() {
	      if (isRegular == true) {
	          return status = true;
	      }if (isRegular == false) {
	          return status = false;
	      }
	      return status;
	  }

    public void callFaculty(String name, String contactNum, double salary, String department) {

        setName(name);
        setContactNum(contactNum);        
        setSalary(salary);
        setDepartment(department);
        
        System.out.println("----------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Salary: " + getSalary());
        System.out.println("Departemnt: " + getDepartment());
        
        if (status() == true) {
            System.out.println("Status: Regular/Tenured");
        } 
        else if (status() == false) {
            System.out.println("Status: Not Regular");
        }
        
	}
}
