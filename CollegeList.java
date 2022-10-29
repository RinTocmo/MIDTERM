import java.util.*;
public class CollegeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee E1 = new Employee();
		Faculty F1 = new Faculty();
		Student S1 = new Student();
		
		System.out.println("Press E for Employee, F for Faculty, or S for Student: ");
		String choose = sc.nextLine();
		
		if (choose.compareToIgnoreCase("E") == 0) {			
			System.out.println("Type employee's name, contact number, salary, and department");
	        System.out.println("Enter after every input");
	        E1.callEmployee(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.next());
	               
		} 
		else if(choose.compareToIgnoreCase("F") == 0) {	    	
	    	System.out.println("Press Y regular/tenured or N if not");
	    	String ab = sc.nextLine();
	    	
	    	if (ab.compareToIgnoreCase("Y") == 0) {
	    		F1.isRegular = true;	    		
	    		    		
	    	   }
	    	else if (ab.compareToIgnoreCase("N") == 0) {
	    		F1.isRegular = false;
	    		
	    	}
	    	else {
	    		System.out.println("Invalid Input. Please try again!");
	    		System.exit(0);
	    	}
	    	System.out.println("Type employee's name, contact number, salary, and department");
	        System.out.println("Enter after every input");
	        F1.callFaculty(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.next());
	       

	    }  
		else if (choose.compareToIgnoreCase("S") == 0) {
			System.out.println("Type student's name, contact number, program, and year level");
	        System.out.println("Enter after every input");
	        S1.callStudent(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
	       
		}
		else {
			System.out.println("Invalid Input. Please try again!");		
			System.exit(0);
		}
		sc.close();

	} 

}
