/*
Write a class Employee, which represents an employee in a company. The employee has a employeeNumber (9 digit number), firstName, lastName and emailId as member variables. Create a few employee objects and store them in an array. Write the insertion sort algorithm, which takes an array of employee and sorts them in order of their employee number.
*/
package ch03_assign;


public class Employee
{
	public int employeeNumber;
	public String firstName;
	public String lastName;
	public String emailId;
	
	public Employee( int eN, String fN, String lN, String eI )
	{
		this.employeeNumber = eN;
		this.firstName = fN;
		this.lastName = lN;
		this.emailId = eI;
	}
	
	public void showEN()
	{
		System.out.println(this.employeeNumber);
	}
}

