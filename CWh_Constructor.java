package com.visionit;

class Employee
{ 
  private int Salary;
  private String Name;
  
  public Employee()
  {
	   this.Salary= 10000;
  }
  public Employee(int n)
  {
	  this.Salary=n;
  }
  public Employee(int n, String nm)
  {
	  this.Salary=n;
	  this.Name= nm;
  }
  
  public double getSalary()
  {
	  return Salary;
  }
  public String getName()
  {
	  return Name;
  }
}

public class CWh_Constructor {

	public static void main(String[] args) {
	  // Employee lp=new Employee();
		 Employee lp=new Employee(20000);
		//Employee lp=new Employee(10000, "Lokesha");
	    
		System.out.println("Name of Employee is -" + lp.getName());
		System.out.println("Salary of Employee is : "+lp.getSalary());
		
	    
	}

}
