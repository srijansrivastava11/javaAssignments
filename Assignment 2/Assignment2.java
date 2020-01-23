import java.util.*;
public class Assignment2 {

    // Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public static double socialSecurityTax(Employee employee) {
        //write your code here
    	double social_security_tax;
    	if(employee.salary <= 8900) {
    		 social_security_tax=employee.salary * 6.2/100;
    		
    	}
    	else {
    		 social_security_tax=106800 * 6.2/100;
    	}
    	System.out.println("Social Security Tax = "+social_security_tax);
		return social_security_tax;
    	//return 0;
    }

   
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
    	double insurance;
    	if(employee.age < 35) {
    		insurance= employee.salary * 3/100;
    	}
    	else if(employee.age > 35 && employee.age < 50){
    		insurance = employee.salary * 4/100;
    	}
    	else if(employee.age > 50 && employee.age < 60) {
    		insurance= employee.salary * 5/100;
    	}
    	else {
    		insurance= employee.salary * 6/100;
    	}
    	
    	System.out.println("Insurance = "+ insurance);
    	return insurance;
    }


    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
      
//    	 double min    = Math.min(e1.salary, Math.min(e2.salary, e3.salary));
//    	 double max    = Math.max(e1.salary, Math.max(e2.salary, e3.salary));
//    	 double median = e1.salary+ e2.salary+ e3.salary- min - max;
//    	 if(e1.salary == min) {
//    		 System.out.println(e1.name);
//    	 }
//    	 else if(e2.salary == min) {
//    		 System.out.println(e2.name);
//    	 }
//    	 else {
//    		 System.out.println(e3.name);
//    	 }
//    	 System.out.println(min);
//         System.out.println(median);
//         System.out.println(max);
    	
    	Employee first, second, third;
    	if(e1.salary < e2.salary) {
    		if(e1.salary < e3.salary) {
    			// e1 < e2 and e1 < e3
    			first = e1;
    			if(e2.salary < e3.salary) {
    				// e1 < e2 < e3
    				second = e2;
    				third = e3;
    			}
    			else {
    				// e1 < e3 < e2
    				second = e3;
    				third = e2;
    			}
    		}
    		else {
    			// e3 < e1 < e2
    			first = e3;
    			second = e1;
    			third = e2;
    		}
    	}
    	else {
    		// e2 < e1 and e2 < e3
    		if(e2.salary < e3.salary) {
    			first = e2;
    			// e2 < e1 < e3
    			if(e1.salary < e3.salary) {
    				second = e1;
    				third = e3;
    			}
    			else {
    				// e2 < e3 < e1
    				second = e3;
    				third = e1;
    			}
    		}
    		else {
    			// e3 < e2 < e1
    			first = e3;
    			second = e2;
    			third = e1;
    		}
    	}
    	
    	System.out.println(first.name);
    	System.out.println(second.name);
    	System.out.println(third.name);
    }
	
//Extra credit


	    /**
	     * I have written some code below. What I want is to swap two Employee objects.
	     * One is Jenny and one is John. But after running it, I got the result below:
	     * Before: a=Jenny
	     * Before: b=John
	     * After: a=Jenny
	     * After: b=John
	     * There is no change after swap()! Do you know the reason why my swap failed?
	     * Write your understanding of the reason and explain it.
	     */
	    /*
	     write your understanding here.
	     Your Answer:
	     Swapping will take place inside the swap function but not in the main function this is because Java is pass by value
	     We are changing values of x and y but they are copies of “a” and “b” reference locations, so actually there is no change in the values of “a” and “b” and hence the output.
	    */
	    public static void main(String[] args) {
	        Employee a = new Employee("Jenny", 20, Employee.Gender.FEMALE, 1200);
	        Employee b = new Employee("John", 30, Employee.Gender.MALE, 500);
	        Employee c = new Employee("Alice", 45, Employee.Gender.MALE, 1000);
	        System.out.println("Before: a=" + a.getName());
	        System.out.println("Before: b=" + b.getName());
	        //swap(a, b);
	        socialSecurityTax(a);
	        insuranceCoverage(a);
	        sortSalary(a,b,c);
	        System.out.println("After: a=" + a.getName());
	        System.out.println("After: b=" + b.getName());
	    }
	

	    public static void swap(Employee x, Employee y) {
	        Employee temp = x;
	        x = y;
	        y = temp;
	        System.out.println("In function: a=" + x.getName());
	        System.out.println("In function: b=" + y.getName());
	    }
	}
