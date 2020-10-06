package com.Corejava.Test;
//agrregation one to many association.
public class Employee {
	 
		int id,Rating,EmployeeStartofyear;
		String name;  
		Company address;  
		  
		public Employee(int id, String name, int Rating, int EmployeeStartofyear, Company address) {
			this.name = name; 
		    this.id = id;  
		     this.Rating=Rating;
		     this.EmployeeStartofyear=EmployeeStartofyear;
		    this.address=address;  
		}  
		  
		void display(){  
		System.out.println("Employee name="+name);
		System.out.println("Employee Id="+id);
		
		System.out.println("Employeejoiningyear="+EmployeeStartofyear);
		System.out.println("Employee Rating is="+Rating+"out of 5");
		System.out.println("Company Name= "+address.name);
		System.out.println("Company Address= " +address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Company address1=new Company("Techouts","Hyderabad", "Telangana","India");  
            Employee e1=new Employee(111, "balaji", 3, 2017,address1);  
		    Employee e2=new Employee(112,"arun", 4, 2014, address1); 
		    Employee e3=new Employee(113,"srinivasan", 5, 2014, address1);
	    e1.display();  
	    System.out.println("");
		e2.display(); 
		System.out.println("");
		e3.display();
		System.out.println("");
		      
		}  
		}  


