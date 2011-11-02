package package1;

import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	public Date hireDate;

	public Employee(Date hireDate,String firstName, String lastName, int age, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDate(){
		return hireDate;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int compareTo(Employee arg0) {
		int res= lastName.compareTo(arg0.lastName);
		if (res == 0)
		{
			res= firstName.compareTo(arg0.firstName);
		}
		return res;
	}
	public boolean equals(Employee em){
		
		return (compareTo(em)==0);
	}
	
}
